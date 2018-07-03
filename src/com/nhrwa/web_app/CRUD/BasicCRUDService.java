package com.nhrwa.web_app.CRUD;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.mysql.jdbc.StringUtils;
import com.nhrwa.web_app.annotations.Entity;
import com.nhrwa.web_app.annotations.EntityField;
import com.nhrwa.web_app.entity.BaseEntity;
import com.nhrwa.web_app.exceptions.ImproperEntityException;
import com.nhrwa.web_app.services.DBHandler;

public class BasicCRUDService<T extends BaseEntity> {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private final String tabelName;
	private final Class<?> clss;
	private final ArrayList<Field> fields;
	private final boolean readOnly;

	public String getTabelName() {
		return tabelName;
	}

	public BasicCRUDService(Class<T> t) throws ImproperEntityException {
		super();
		clss = t;
		fields = getAllFields(clss);
		if (t.isAnnotationPresent(Entity.class)) {
			Entity entityAnnotation = t.getAnnotation(Entity.class);
			this.tabelName = entityAnnotation.tableName();
			this.readOnly = entityAnnotation.readOnly();
		} else {
			throw new ImproperEntityException();
		}
	}

	// Find methods

	public Collection<T> findAll() {
		String query = "";
		return find(query);
	}

	public T findById(String id) {
		String query = "WHERE id=\"" + id + "\"";
		return find(query).get(0);
	}

	private List<T> find(String query) {
		List<T> entities = new ArrayList<T>();
		Connection con;
		try {
			con = DBHandler.getConnection();
			try {
				ResultSet rs = DBHandler.readFromDB(tabelName, query, con);
				if (rs.next()) {
					@SuppressWarnings("unchecked")
					T entity = (T) clss.newInstance();
					for (Field field : fields) {
						field.setAccessible(true);
						if (field.isAnnotationPresent(EntityField.class)) {
							EntityField fieldAnnotation = field.getAnnotation(EntityField.class);
							if (Integer.class.isAssignableFrom(field.getType())) {
								field.set(entity, rs.getInt(fieldAnnotation.columnName()));
							} else if (String.class.isAssignableFrom(field.getType())) {
								field.set(entity, rs.getString(fieldAnnotation.columnName()));
							} else if (Long.class.isAssignableFrom(field.getType())) {
								field.set(entity, rs.getLong(fieldAnnotation.columnName()));
							}
						}
					}
					entities.add(entity);
				}
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			} finally {
				con.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return entities;
	}

	/*
	 * Create methods
	 *
	 */

	public boolean createEntity(T entity) {
		List<T> list = new ArrayList<>();
		list.add(entity);
		return createEntities(list);
	}

	public boolean createEntities(Collection<T> entities) {
		if (!readOnly) {
			Iterator<T> i = entities.iterator();
			String valueQuery = "";
			while (i.hasNext()) {
				T entity = i.next();
				if (StringUtils.isNullOrEmpty(entity.getId())) {
					entity.setId(Integer.toString(ID_GENERATOR.getAndIncrement()));
				}
				valueQuery.concat(getEntityValueQuery(i.next()));
				if (i.hasNext()) {
					valueQuery.concat(",");
				}
			}
			return DBHandler.createToDB(tabelName, getFieldsString(), valueQuery);
		} else
			return false;

	}

	private String getEntityValueQuery(T entity) {
		String valueQuery = "(";
		boolean initPeriod = false;
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(EntityField.class)) {
				if (initPeriod) {
					valueQuery.concat(",");
				} else {
					initPeriod = true;
				}
				field.setAccessible(true);
				try {
					if (Integer.class.isAssignableFrom(field.getType())) {
						valueQuery.concat(Integer.toString((int) field.get(entity)));
					} else if (String.class.isAssignableFrom(field.getType())) {
						valueQuery.concat((String) field.get(entity));
					} else if (Long.class.isAssignableFrom(field.getType())) {
						valueQuery.concat(Long.toString((int) field.get(entity)));
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		valueQuery.concat(")");
		return valueQuery;
	}

	/*
	 * UPdate methods
	 *
	 *
	 */

	public boolean updateEntity(T entity) {
		if (!readOnly) {
			String query = "";
			T entityInDB = findById(entity.getId());
			ArrayList<Field> updatedFields = getUpdatedFields(entity, entityInDB);
			Iterator<Field> i = updatedFields.iterator();
			boolean initPeriod = false;
			while (i.hasNext()) {
				Field field = i.next();
				EntityField fieldAnnotation = field.getAnnotation(EntityField.class);
				if (initPeriod) {
					query.concat(",");
				} else {
					initPeriod = true;
				}
				query.concat(" " + fieldAnnotation.columnName() + "=" + field);

			}
			return DBHandler.updateToDB(this.tabelName, query, entity.getId());
		} else
			return false;

	}

	private ArrayList<Field> getUpdatedFields(T entity, T entityInDB) {
		ArrayList<Field> fieldsUpdated = new ArrayList<>();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(EntityField.class)) {
				field.setAccessible(true);
				try {
					if (Integer.class.isAssignableFrom(field.getType())) {
						if (Integer.compare(field.getInt(entity), field.getInt(entityInDB)) != 0) {
							fieldsUpdated.add(field);
						}
					} else if (String.class.isAssignableFrom(field.getType())) {
						if (((String) field.get(entity)).equals(((String) field.get(entityInDB)))) {
							fieldsUpdated.add(field);
						}
					} else if (Long.class.isAssignableFrom(field.getType())) {
						if (((Long) field.get(entity)).equals(((Long) field.get(entityInDB)))) {
							fieldsUpdated.add(field);
						}
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return fieldsUpdated;

	}

	private String getFieldsString() {
		String valueQuery = "(";
		boolean initPeriod = false;
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(EntityField.class)) {
				if (initPeriod) {
					valueQuery = ",";
				} else {
					initPeriod = true;
				}
				EntityField fieldAnnotation = field.getAnnotation(EntityField.class);
				valueQuery.concat(fieldAnnotation.columnName());
			}
		}
		valueQuery.concat(")");
		return valueQuery;
	}

	private ArrayList<Field> getAllFields(Class<?> clss) {
		Class<?> current = clss;
		ArrayList<Field> fields = new ArrayList<>();
		while (current.getSuperclass() != null) { // we don't want to process Object.class
			fields.addAll(Arrays.asList(current.getDeclaredFields()));
			current = current.getSuperclass();
		}
		return fields;
	}
}

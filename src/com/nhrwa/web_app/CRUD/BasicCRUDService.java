package com.nhrwa.web_app.CRUD;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nhrwa.web_app.annotations.EntityField;
import com.nhrwa.web_app.annotations.TableName;
import com.nhrwa.web_app.entity.BaseEntity;
import com.nhrwa.web_app.exceptions.ImproperEntityException;
import com.nhrwa.web_app.services.DBHandler;

public class BasicCRUDService<T extends BaseEntity> {
	private final String tabelName;
	private final Class<?> clss;

	public String getTabelName() {
		return tabelName;
	}

	public BasicCRUDService(Class<T> t) throws ImproperEntityException {
		super();
		clss = t.getClass();
		if (t.isAnnotationPresent(TableName.class)) {
			this.tabelName = t.getAnnotation(TableName.class).name();
		} else {
			throw new ImproperEntityException();
		}
	}

	public Collection<T> findAll() {
		String query="";
		return find(query);
	}

	private Collection<T> find(String query){
		Field[] fields = clss.getDeclaredFields();
		List<T> entities= new ArrayList<T>();
		ResultSet rs = DBHandler.readFromDB(tabelName, query);
		try {
			if (rs.next()) {
				@SuppressWarnings("unchecked")
				T entity = (T) clss.newInstance();
				for (Field field : fields) {
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
		} catch (SQLException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return entities;
	}

}

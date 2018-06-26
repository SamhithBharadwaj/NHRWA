package com.nhrwa.web_app.CRUD;

import com.nhrwa.web_app.annotations.TableName;
import com.nhrwa.web_app.entity.BaseEntity;
import com.nhrwa.web_app.exceptions.ImproperEntityException;

public class BasicCRUDService<T extends BaseEntity> {
	private final String tabelName;

	public String getTabelName() {
		return tabelName;
	}

	public BasicCRUDService(Class<T> T) throws ImproperEntityException {
		super();
		if (T.isAnnotationPresent(TableName.class)) {
			this.tabelName = T.getAnnotation(TableName.class).name();
		} else {
			throw new ImproperEntityException();
		}
	}

}

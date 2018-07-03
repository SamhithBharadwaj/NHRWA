package com.nhrwa.web_app.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
	String tableName();
	boolean readOnly() default false;
}

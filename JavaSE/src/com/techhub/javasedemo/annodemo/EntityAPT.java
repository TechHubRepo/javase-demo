package com.techhub.javasedemo.annodemo;

import java.lang.reflect.Field;

public class EntityAPT {

	private EntityAPT() {
	}

	public static <E> String getInsertQuery(E e) throws IllegalArgumentException, IllegalAccessException {
		Class<?> clss = e.getClass();
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		if (clss.isAnnotationPresent(Table.class)) {
			sb.append(clss.getDeclaredAnnotation(Table.class).name());
		}
		sb.append(" (");
		Field[] fields = clss.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(Column.class)) {
				sb.append(field.getDeclaredAnnotation(Column.class).name());
				sb.append(" , ");
			}
		}
		sb.append(") VALUES (");
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(Column.class)) {
				sb.append(field.get(e));
				sb.append(" , ");
			}
		}
		sb.append(")");
		return sb.toString();
	}

}

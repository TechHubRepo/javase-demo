package com.techhub.javasedemo.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {

		Locale locale = new Locale("hi", "IN");
//		Locale locale = new Locale("en", "US");

		ResourceBundle resourceBundle = ResourceBundle.getBundle("resource");

		String greet = resourceBundle.getString("greet");
		System.out.println(greet);

		String message = resourceBundle.getString("message");
		message = MessageFormat.format(message, "Harish Kumar","Sunil Kumar");
		System.out.println(message);
	}
}

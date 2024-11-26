package com.techhub.javasedemo.util.collection;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {

//		Properties properties = new Properties();

//		Map<Object, Object> properties = new Properties();
		
//		Dictionary<Object, Object> properties = new Properties();
		
		Dictionary<Object, Object> properties = new Hashtable<>();
		
		properties.put("key1", "Value 1");
		properties.put("key2", "Value 2");
		properties.put("key3", "Value 3");
		properties.put("key4", "Value 4");

		System.out.println(properties);

	}
}

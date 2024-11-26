package com.techhub.javasedemo.util.collection;

import java.util.*;

public class SortedMapDemo {

	public static void main(String[] args) {

		SortedMap<String, String> map = new TreeMap<>();
		
		map.put("name", "Rohit Kumar");
		map.put("dob", "15-feb-1994");
		map.put("email", "rohit_kumar@gmail.com");
		map.put("mobile", "9876543210");
//		map.put(null, "9876543210");

//		System.out.println(map.subMap("dob", "name"));
//		System.out.println(map.headMap("mobile"));
//		System.out.println(map.tailMap("mobile"));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		print(map);

	}

	public static void print(Map<String, String> map) {
		System.out.println("***************** Print *******************");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("-------------------------------------------");
	}
}

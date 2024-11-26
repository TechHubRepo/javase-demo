package com.techhub.javasedemo.util.collection;

import java.util.*;

public class NavigableMapDemo {

	public static void main(String[] args) {

		NavigableMap<String, String> map = new TreeMap<>();
		map.put("name", "Rohit Kumar");
		map.put("dob", "15-feb-1994");
		map.put("email", "rohit_kumar@gmail.com");
		map.put("mobile", "9876543210");

//		System.out.println("lowerKey : " + map.lowerKey("name"));
//		System.out.println("lowerKey : " + map.lowerEntry("name"));

//		System.out.println("lowerKey : " + map.floorKey("mobile"));
//		System.out.println("lowerKey : " + map.floorEntry("mobile"));

//		System.out.println("lastEntry : " + map.ceilingKey("name"));
//		System.out.println("lastEntry : " + map.ceilingEntry("name"));

//		System.out.println("lastEntry : " + map.higherKey("email"));
//		System.out.println("lastEntry : " + map.higherEntry("email"));
		
		
//		System.out.println("firstEntry : " + map.firstEntry());
//		System.out.println("firstKey : " + map.firstKey());
		
//		System.out.println("lastEntry : " + map.lastEntry());
//		System.out.println("lastKey : " + map.lastKey());

//		System.out.println("firstEntry : " + map.descendingKeySet());
//		System.out.println("firstEntry : " + map.descendingMap());
		
//		System.out.println("subMap : " + map.subMap("email", "name"));
//		System.out.println("subMap : " + map.subMap("email", true, "name", true));

//		System.out.println("subMap : " + 	map.headMap("email"));
//		System.out.println("subMap : " + 	map.headMap("email",true));

//		System.out.println("subMap : " + 	map.tailMap("email"));
//		System.out.println("subMap : " + 	map.tailMap("email",true));

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

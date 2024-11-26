package com.techhub.javasedemo.util.collection;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
//		Map<String, String> map = new LinkedHashMap<>();

		
		map.put("name", "Rohit Kumar");
		map.put("dob", "15-feb-1994");
		map.put("email", "rohit_kumar@gmail.com");
		map.put("mobile", "9876543210");
		map.put(null, "XYZ");

		print(map);

//		System.out.println(map.get("dob"));

//		System.out.println("size : "+map.size());
//		System.out.println("isEmpty : "+map.isEmpty());
//		System.out.println("containsKey : "+map.containsKey("name"));
//		System.out.println("containsValue : "+map.containsValue("15-feb-1994"));
//		System.out.println("remove : "+map.remove("name"));

//		map.clear();

//		printKey(map);
//		printValue(map);

//		map.forEach((key,value)->{
//			 System.out.println(key+" : "+value);
//		});

//		System.out.println("getOrDefault : " + map.getOrDefault("name", "Defaule Value"));
//		System.out.println("getOrDefault : " + map.getOrDefault("name1", "Defaule Value"));

//		map.replaceAll((key, value) -> {
//			if (key.equals("name")) {
//				return "Ram Niwash";
//			}
//			return value;
//		});
//
//		String v=map.computeIfAbsent("name1", (vv)->{
//			return "a";
//		});
//		System.out.println(v);

//		print(map);

//		Set<Map.Entry<String, String>> entrySet=map.entrySet();
//		for(Map.Entry<String,String> me:entrySet) {
//			System.out.println(me.getKey()+" : "+me.getValue());
//		}

	}

	public static void print(Map<String, String> map) {
		System.out.println("***************** Print *******************");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("-------------------------------------------");
	}

	public static void printKey(Map<String, String> map) {
		System.out.println("***************** Print Key *******************");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ", ");
		}
		System.out.println("-------------------------------------------");
	}

	public static void printValue(Map<String, String> map) {
		System.out.println("***************** Print Value *******************");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value + ", ");
		}
		System.out.println("-------------------------------------------");
	}
}

package com.techhub.demo.java9.newfeautres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The CollectionUpdate
 * 
 * @author ramniwash
 *
 */
public class CollectionUpdate {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println("List : " + list);

		List<String> unModifiableList = Collections.unmodifiableList(list);
		System.out.println("unModifiableList : " + unModifiableList);
//		unModifiableList.add("X");

		List<Integer> unModifiableList2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 5);
		System.out.println("unModifiableList2 : " + unModifiableList2);
//		unModifiableList2.add(10);

		Map<String, String> unModifiableMap = Map.of("name", "Ram Niwash", "age", "25");
		System.out.println("unModifiableMap : " + unModifiableMap);
		Map<Integer, String> unModifiableMap2 = Map.ofEntries(Map.entry(1000, "Hindi"), Map.entry(10005, "Sanskrit"));
		System.out.println("unModifiableMap2 : " + unModifiableMap2);
	}
}

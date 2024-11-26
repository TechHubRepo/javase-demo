package com.techhub.javasedemo.util.collection;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(10);
//		List<String> list = new LinkedList<>();

		list.add("Ram Niwash");
		list.add("Purshtom Dass");
		list.add("Sajjan Kumar");
		list.add("Kuldeep Singh");
		list.add("XXX");
		list.add("Ram Niwash");
		list.add("YYY");

//		System.out.println(list.get(1));
//		list.add(1, "ABCD");
//		list.remove(1);
//		System.out.println(list.indexOf("Ram Niwash"));
//		System.out.println(list.lastIndexOf("Ram Niwash"));

//		ListIterator<String> listIterator = list.listIterator(2);
//		
//		
//		while(listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}

//		System.out.println(list.subList(2, 5));

//		list.replaceAll(uoperator -> {
//			return "ABC";
//		});

//		list.sort(null);

		System.out.println("***************** List  Print *******************");
		System.out.println(list);
		System.out.println("-----------------------------------------------------------------------");
		for (String element : list) {
			System.out.println(element);
		}
	}
}

package com.techhub.javasedemo.util.collection;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
//		Set<String> set = new LinkedHashSet<>();
//		Set<String> set = new TreeSet<>();
//		Set<String> set = new ConcurrentSkipListSet<>();
		
		set.add("Ram Niwash");
		set.add("Sohan");
		set.add("Mohan");
		set.add("Ajit");
		set.add("Sanjana");
		set.add("Shivam");
		set.add("Ganesa");
		set.add("Krishna");
		
		System.out.println("***************** Print *******************");
		System.out.println(set);
		System.out.println("-----------------------------------------------------------------------");
		for (String element : set) {
			System.out.println(element);
		}
	}
}

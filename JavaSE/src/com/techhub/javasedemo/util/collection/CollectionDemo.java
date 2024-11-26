package com.techhub.javasedemo.util.collection;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>();
		c.add("Ram Niwash");
		c.add("Purshtom Dass");
		c.add("Sajjan Kumar");
		c.add("Kuldeep Singh");

//		System.out.println("size : " + c.size());
//		System.out.println("isEmpty : " + c.isEmpty());
//		System.out.println("contains(Abc) : " + c.contains("Abc"));
//		System.out.println("contains(Ram Niwash) : " + c.contains("Ram Niwash"));

//		System.out.println("************** Object Array **************");
//		Object[] objArr = c.toArray();
//		for (Object obj : objArr) {
//			String str = (String) obj;
//			System.out.println("str : " + str);
//		}

//		System.out.println("************** String Array **************");
//		String strArr[] = new String[c.size()];
////		strArr = c.toArray(strArr);
//		c.toArray(strArr);
//		for (String str : strArr) {
//			System.out.println("str : " + str);
//		}

//		System.out.println("************** IntFunction String Array **************");
//		IntFunction<String[]> intFunction = (value) -> {
//			System.out.println("value : " + value);
//			String[] sArr = new String[4];
//			return sArr;
//		};
//
//		String[] sArr = c.toArray(intFunction);
//		for (String s : sArr) {
//			System.out.println("s : " + s);
//		}

//		c.remove("Ram Niwash");

//		Collection<String> c2 = List.of("Ram Niwash", "Purshtom Dass");
//		System.out.println("containsAll(Collection<String>) : " + c.containsAll(c2));

//		Stream<String> stream = c.stream();
//		Stream<String> stream = c.parallelStream();
//		Stream<String> stream2=stream.sorted();

//		stream2.forEach(element->{
//			System.out.println("element : "+element);
//		});

//		c.removeAll(c2);

//		c.removeIf(element -> {
//			return element.equals("Ram Niwash") ||  element.equals("Purshtom Dass")  ? true : false;
//		});

//		c.retainAll(c2);

//		c.addAll(c2);

//		c.clear();

		System.out.println("***************** Collection  Print *******************");
		for (String element : c) {
			System.out.println("element : " + element);
		}
	}
}
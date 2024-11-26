package com.techhub.javasedemo.util.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(6);
		list.add(9);
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(4);
		System.out.println(list);

//		List<?> list=Collections.EMPTY_LIST;
//		System.out.println("list : "+list);
//		System.out.println("set : "+Collections.EMPTY_SET);
//		System.out.println("map : "+Collections.EMPTY_MAP);

//		Collections.addAll(list, 11,22,33,44);
//		System.out.println(list);

//		Collections.sort(list);
//		System.out.println(list);
//
//		int index=Collections.binarySearch(list, 6);
//		System.out.println("index : "+index);

//		List<Integer> tempList=Collections.unmodifiableList(list);
//		System.out.println(tempList);
//		tempList.add(100);

//		List<Integer> tempList=Collections.checkedList(list,Integer.class);
//		tempList.add(5);
//		System.out.println(tempList);

//		Collections.fill(list, 0);		
//		System.out.println(list);

//		list.add(5);
//		list.add(5);
//		System.out.println(list);
//		int frequectTimes=Collections.frequency(list, 5);
//		System.out.println("frequectTimes : "+frequectTimes);

//		List<Integer> tempList= new ArrayList<>();
//		for(int i=0;i<10;i++) {
//			tempList.add(0);
//		}
//		Collections.copy(tempList, list);
//		System.out.println(tempList);

//		int max = Collections.max(list);
//		int max =Collections.min(list);
//		System.out.println("max : " + max);

//		List<Integer> tempList = Collections.synchronizedList(list);
//		System.out.println("tempList : "+tempList);

//		List<String> tempList = Collections.singletonList("ABC");

//		Collections.shuffle(list);
//		System.out.println(list);
//		
//		Collections.shuffle(list);
//		System.out.println(list);

//		Collections.reverse(list);
//		System.out.println(list);

//		Collections.swap(list, 0, 8);
//		System.out.println(list);

		Collections.replaceAll(list, 7, 0);
		System.out.println(list);
	}
}

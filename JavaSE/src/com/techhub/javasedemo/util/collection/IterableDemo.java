package com.techhub.javasedemo.util.collection;

import java.util.*;

public class IterableDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();

		c.add("Ram Niwash");
		c.add("Purshtom Dass");
		c.add("Sajjan Kumar");
		c.add("Kuldeep Singh");

//		c.forEach(element -> {
//			System.out.println(element);
//		});

//		System.out.println("**************** Spliterator Interface ****************");
//		Spliterator<String> spliterator = c.spliterator();
//		System.out.println("estimateSize : " + spliterator.estimateSize());
//
//		System.out.println("tryAdvance : " + spliterator.tryAdvance(action -> {
//			System.out.println(action);
//		}));
//		
//		System.out.println("tryAdvance : " + spliterator.tryAdvance(action -> {
//			System.out.println(action);
//		}));
//		System.out.println("getExactSizeIfKnown : " + spliterator.getExactSizeIfKnown());
//		System.out.println("estimateSize : " + spliterator.estimateSize());
//		spliterator.forEachRemaining(action -> {
//			System.out.println(action);
//		});

		System.out.println("**************** Iterator Interface ****************");
		Iterator<String> iterator = c.iterator();
//		while (iterator.hasNext()) {
//			String element = iterator.next();
//			System.out.println(element);
////			iterator.remove();
//		}

//
		iterator.forEachRemaining(element -> {
			System.out.println(element);
		});

		System.out.println("**************** Collection Print ****************");
		c.forEach(element -> {
			System.out.println(element);
		});
	}
}

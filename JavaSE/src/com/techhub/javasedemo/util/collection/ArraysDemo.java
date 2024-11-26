package com.techhub.javasedemo.util.collection;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

import java.util.stream.*;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] elements = { 5, 8, 2, 6, 9, 1, 3, 7, 6 };
		int[] elements2 = { 5, 8, 2, 6, 9, 1, 3, 7, 6};

//		Arrays.sort(elements);
//		Arrays.sort(elements,2,6);

//		Arrays.parallelSort(elements);
//		Arrays.parallelSort(elements,2,6);

//		int index=Arrays.binarySearch(elements,6);
//		int index=Arrays.binarySearch(elements,2,6,9);
//		System.out.println(index);

//		List<int[]> list = Arrays.asList(elements);
//		for(int i:list.get(0)) {
//			System.out.print(i + ", ");
//		}

//		List<Integer> list2 = Arrays.asList(5,6,9,2,1,8);
//		List<String> list2 = Arrays.asList("ABCD","JKLM","XYZ");
//		System.out.println(list2);

//		int result = Arrays.compare(elements, elements2);
//		System.out.println("result : " + result);

//		int[] tempElements=Arrays.copyOf(elements, 5);
//		int[] tempElements=Arrays.copyOfRange(elements, 2,7);
//		print(tempElements);

//		boolean flag=Arrays.equals(elements, elements2);
//		Arrays.deepEquals(elements, elements2);
//		System.out.println("flag : " + flag);

//		Arrays.fill(elements, 0);
//		Arrays.fill(elements, 3,7,0);

//		System.out.println("elements.hashCode : " + elements.hashCode());
//		System.out.println("elements2.hashCode : " + elements2.hashCode());
//		System.out.println("Arrays.hashCode(elements) : "+Arrays.hashCode(elements));
//		System.out.println("Arrays.hashCode(elements2) : "+Arrays.hashCode(elements2));

//		int mis_matchIndex = Arrays.mismatch(elements, elements2);
//		System.out.println("mis_matchIndex : " + mis_matchIndex);

//		print(elements);
//		Arrays.parallelPrefix(elements, (left,right)->{
//			System.out.println("left : "+left + " , right : "+right);
//			return left+right;
//		});

//		print(elements);
//		Arrays.parallelSetAll(elements, (operand)->{
//			System.out.println("operand : "+operand);
//			return (operand*3);
//		});

//		 Spliterator.OfInt spliteratorOfInt=Arrays.spliterator(elements);
////		 Spliterator.OfInt spliteratorOfInt=Arrays.spliterator(elements,2,6);
//		 IntConsumer consumer=(e)->{
//			 System.out.print(e + ", ");
//		 };
//		 spliteratorOfInt.forEachRemaining(consumer);

		IntStream intStream=Arrays.stream(elements2);
//		OptionalInt optionalInt=intStream.findFirst();
//		System.out.println(optionalInt.getAsInt());

//		System.out.println(elements);
//		System.out.println(Arrays.toString(elements));
//
		print(elements);
	}

	public static void print(int[] elements) {
		System.out.println("\n*********** Print ***********");
		for (int element : elements) {
			System.out.print(element + ", ");
		}
		System.out.println("\n--------------------------------------------");
	}
}

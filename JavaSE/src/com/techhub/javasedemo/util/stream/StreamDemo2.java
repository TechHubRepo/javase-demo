package com.techhub.javasedemo.util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("abc", "xyz", "cdf", "pqr", "abc", "fd", "cad","tac");

		Stream<String> stream = list.stream();

//		Stream<String> distinctStream = stream.distinct();
//		distinctStream.forEach(e->{
//			System.out.println(e);
//		});

//		boolean flag = stream.allMatch(v -> {
//			return v.matches("[a-z]+");
//		});
//		System.out.println("flag : " + flag);

//		boolean flag = stream.anyMatch(v -> {
//			return v.matches("[0-9]+");
//		});
//		System.out.println("flag : " + flag);

//		System.out.println("count : " + stream.count());

//		Stream<String> filterStream = stream.filter(e -> {
//			return e.contains("a") ? true : false;
//		});
//		filterStream.forEach(e->{
//			System.out.println("e : " + e);
//		});

//		Stream<String> tempStream=stream.dropWhile((e)->{
//			return e.equals("abc")?true:false;
//		});
//		tempStream.forEach(e->{
//			System.out.println("e : " + e);
//		});

//		Optional<String> optional = stream.findAny();
//		Optional<String> optional = stream.findFirst();
//		System.out.println("optional : " + optional);

//		Stream<Character> tempStream=stream.flatMap(str -> {
//			return Stream.of(str.charAt(0));
//		});
//		tempStream.forEach(e -> {
//			System.out.println("e : " + e);
//		});

//		IntStream tempStream=stream.flatMapToInt(e->{
//			return IntStream.of(e.charAt(0));
//		});
//		tempStream.forEach(e -> {
//			System.out.println("e : " + e);
//		});
		
		List<String> list2=List.of("z","b","x","a");
		Stream<String> stream2=list2.stream();
//		Stream<String> tempStream=stream2.sorted((e1,e2)->{
//			return e2.compareTo(e1);
//		});
//		tempStream.forEach(e -> {
//			System.out.println("e : " + e);
//		});
		
		Stream<String> tempStream=stream2.peek(e->{
			System.err.println("e : " + e);
		}).skip(1);
		
		tempStream.forEach(e -> {
			System.out.println("e  : " + e);
		});
		
	}
}

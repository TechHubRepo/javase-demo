package com.techhub.java8.features.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		String[] words = new String[10];
		words[5] = "Namaste";

		Optional<String> checkNull = Optional.ofNullable(words[5]);
		
//		if(words[5]!=null) {
//			
//		}

//		if (checkNull.isPresent()) {
//			String word = words[5].toUpperCase();
//			System.out.print(word);
//		} else {
//			System.out.println("word is null");
//		}
		
		
		checkNull.ifPresent(v->{String word = words[5].toUpperCase();
			System.out.print(word);});
	}

}

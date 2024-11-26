package com.techhub.javasedemo.util.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();

		stack.push("Z");
		stack.push("B");
		stack.push("X");
		stack.push("P");
		stack.push("A");

		print(stack);
		
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//		System.out.println(stack.empty());
//		System.out.println(stack.search("B"));
//		System.out.println(stack.search("P"));
//		System.out.println(stack.search("T"));
		
		print(stack);
	}

	public static void print(Stack<String> stack) {
		System.out.println("***************** Stack  Print *******************");
		System.out.println(stack);
		System.out.println("-----------------------------------------------------------------------");
		for (String element : stack) {
			System.out.println(element);
		}
		System.out.println("-----------------------------------------------------------------------");
	}
}

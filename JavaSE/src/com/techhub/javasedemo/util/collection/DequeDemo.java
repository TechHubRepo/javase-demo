package com.techhub.javasedemo.util.collection;

import java.util.*;

public class DequeDemo {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<>(3);
//		Deque<String> deque=new LinkedList<>();
//		Deque<String> deque=new ConcurrentLinkedDeque<>();

		deque.offer("Z");
		deque.offer("B");
		deque.offer("X");
		deque.offer("P");
		deque.offer("A");
		deque.offer("R");

		print(deque);

//		deque.addFirst("Nameste");
//		deque.addLast("Hello");

//		boolean flag=deque.offerFirst("Nameste");
//		System.out.println("flag : "+flag);
//		flag=deque.offerLast("Hello");
//		System.out.println("flag : "+flag);

//		System.out.println("element : "+deque.removeFirst());
//		System.out.println("element : "+deque.removeLast());

//		System.out.println("element : "+deque.pollFirst());
//		System.out.println("element : "+deque.pollLast());

//		System.out.println("element : "+deque.getFirst());
//		System.out.println("element : "+deque.getLast());

//		System.out.println("element : "+deque.peekFirst());
//		System.out.println("element : "+deque.peekLast());

//		System.out.println("removeFirstOccurrence : "+deque.removeFirstOccurrence("Z"));
//		System.out.println("removeFirstOccurrence : "+deque.removeLastOccurrence("R"));

//		deque.push("E 1");
//		deque.push("E 2");
//		deque.push("E 3");
//		print(deque);

//		System.out.println("element : "+deque.pop());
//		System.out.println("element : "+deque.pop());

//		System.out.println("element : "+deque.pollFirst());

		Iterator<String> dequeIterator = deque.descendingIterator();
		while (dequeIterator.hasNext()) {
			System.out.println(dequeIterator.next());
		}

//		print(deque);
	}

	private static void print(Deque<String> queue) {
		System.out.println("***************** List  Print *******************");
		System.out.println(queue);
		System.out.println("-----------------------------------------------------------------------");
		for (String element : queue) {
			System.out.println(element);
		}
		System.out.println("-----------------------------------------------------------------------");
	}
}

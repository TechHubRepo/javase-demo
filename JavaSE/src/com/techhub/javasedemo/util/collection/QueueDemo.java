package com.techhub.javasedemo.util.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> queue=new PriorityQueue<>();
//		Queue<String> queue=new ArrayDeque<>();
//		Queue<String> queue=new LinkedList<>();
//		Queue<String> queue=new ConcurrentLinkedQueue<>();
//		Queue<String> queue=new ConcurrentLinkedDeque<>();
		
//		queue.offer("Z");
//		queue.offer("B");
//		queue.offer("X");
//		queue.offer("P");
//		queue.offer("A");
//		queue.offer("R");
				
		print(queue);
		
//		System.out.println("remove : "+queue.remove());
//		System.out.println("remove : "+queue.remove());
		
//		System.out.println("poll : "+queue.poll());
//		System.out.println("poll : "+queue.poll());
		
//		System.out.println("element : "+queue.element());
//		System.out.println("element : "+queue.element());
		
//		System.out.println("peek : "+queue.peek());
//		System.out.println("peek : "+queue.peek());
				
		print(queue);
		
	}
	
	private static void print(Queue<String> queue) {
		System.out.println("***************** List  Print *******************");
		System.out.println(queue);
		System.out.println("-----------------------------------------------------------------------");
		for (String element : queue) {
			System.out.println(element);
		}
		System.out.println("-----------------------------------------------------------------------");
	}
}

package com.techhub.javasedemo.langpackage.thread;

public class MainClass {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) throws InterruptedException {

		Thread threadA = new Thread(new ThreadA(),"A");
		ThreadB threadB = new ThreadB();
		threadB.setName("B");
		ThreadC threadC = new ThreadC();
		threadC.setName("C");

		threadB.start();
		threadB.join();
		threadC.start();
		threadC.join();
		threadA.start();
		

		StringBuilder sb = new StringBuilder();
		sb.append(ANSI_RESET);
		sb.append(threadA.getName());
		sb.append(" : ");
		sb.append(threadA.getState());
		sb.append("\n");
		sb.append(threadB.getName());
		sb.append(" : ");
		sb.append(threadB.getState());
		sb.append("\n");
		sb.append(threadC.getName());
		sb.append(" : ");
		sb.append(threadC.getState());
		sb.append("\n");
		System.out.println(sb);
	}
}
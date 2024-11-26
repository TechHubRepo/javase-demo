package com.techhub.javasedemo.langpackage.thread;

public class ThreadA implements Runnable {

	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(ANSI_RED_BACKGROUND);
			sb.append("********************************************\n");
			sb.append("Thread Id : ");
			sb.append(currentThread.getId());
			sb.append("\nThread Name : ");
			sb.append(currentThread.getName());
			sb.append("\nThread Priority : ");
			sb.append(currentThread.getPriority());
			sb.append("\nThread Alive : ");
			sb.append(currentThread.isAlive());
			sb.append("\nThread Group : ");
			sb.append(currentThread.getThreadGroup());
			sb.append("\nThread is Daemon : ");
			sb.append(currentThread.isDaemon());
			sb.append("\nThread State : ");
			sb.append(currentThread.getState());
			sb.append("\nIteration : ");
			sb.append(i);
			sb.append("\n********************************************\n");
			System.out.println(sb);
		}
	}

}

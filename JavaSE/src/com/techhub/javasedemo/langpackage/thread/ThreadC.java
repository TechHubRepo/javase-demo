package com.techhub.javasedemo.langpackage.thread;

public class ThreadC extends Thread {

	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(ANSI_BLUE_BACKGROUND);
			sb.append("********************************************\n");
			sb.append("Thread Id : ");
			sb.append(this.getId());
			sb.append("\nThread Name : ");
			sb.append(this.getName());
			sb.append("\nThread Priority : ");
			sb.append(this.getPriority());
			sb.append("\nThread Alive : ");
			sb.append(this.isAlive());
			sb.append("\nThread Group : ");
			sb.append(this.getThreadGroup());
			sb.append("\nThread is Daemon : ");
			sb.append(this.isDaemon());
			sb.append("\nThread State : ");
			sb.append(this.getState());
			sb.append("\nIteration : ");
			sb.append(i);
			sb.append("\n********************************************\n");
			System.out.println(sb);
		}
	}
}

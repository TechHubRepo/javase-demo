package com.techhub.demo.java9.newfeautres;

import java.io.IOException;

public class ProcessAPIDemo {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("firefox");
		Process firefox = pb.start();
		
	

		ProcessHandle ph = firefox.toHandle();      
		ProcessHandle.Info info = ph.info();         
		
		
		System.out.println("Pid : " +firefox.pid());
		System.out.println("Process path : " + info.command().get());
		System.out.println("Process start time : " + info.startInstant().get());
		System.out.println("Process owner : " + info.user().get());
		System.out.println("Process CPU usage : " + info.totalCpuDuration().get());
	}
}

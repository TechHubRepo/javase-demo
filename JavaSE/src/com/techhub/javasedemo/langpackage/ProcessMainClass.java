package com.techhub.javasedemo.langpackage;

public class ProcessMainClass {

	public static void main(String[] args) throws Exception {

//		Runtime runtime = Runtime.getRuntime();
//		Process process = runtime.exec("firefox");

		ProcessBuilder builder = new ProcessBuilder("firefox");
		Process process = builder.start();

		Thread.sleep(1000 * 30);
		
		process.destroy();
	}
}

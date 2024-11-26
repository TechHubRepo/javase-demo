package com.techhub.javasedemo.langpackage;

import java.lang.Runtime.Version;

public class RuntimeDemo {

	public static void main(String[] args) throws Exception {
		System.out.println(" ************** Program Started **************");		
		Runtime runtime = Runtime.getRuntime();

		runtime.exit(0);
//		runtime.halt(0);recursiveTest
//	    Thread thred=	new JVMShutdownHook();
//		runtime.addShutdownHook(thred);
//		runtime.removeShutdownHook(thred);
//		runtime.exec("firefox");
//		System.out.println(runtime.availableProcessors());
//		System.out.println(runtime.freeMemory());
//		System.out.println(runtime.totalMemory());
//		System.out.println(runtime.maxMemory());
//		runtime.gc();
//		runtime.runFinalization();
//		runtime.load(null);
		Version version = Runtime.version();
		System.out.println("version : : "+version);

		System.out.println(" ************** Program Ended **************");
	}

	static class JVMShutdownHook extends Thread {
		@Override
		public void run() {
			System.out.println("::::::::::: JVM SHUTING DOWN :::::::::::");
		}
	}

}

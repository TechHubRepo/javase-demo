package com.techhub.javasedemo.langpackage.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExceutorMain {

	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		/** My Executor Demo **/
//		System.out.println(ANSI_RESET + "************** My Executor **************");
//		MyExecutor executor=new MyExecutor();
//		executor.execute(new ThreadA());
//		executor.execute(new ThreadB());
//		executor.execute(new ThreadC());

		/** ExecutorService Demo **/
//		System.out.println(ANSI_RESET + "************** ExecutorService **************");
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		ThreadPoolExecutor mypool = (ThreadPoolExecutor) executorService;
//		System.out.println(ANSI_RESET + "size of mypool: " + mypool.getPoolSize());
//
//		executorService.submit(new ThreadA());
//		executorService.submit(new ThreadB());
//		executorService.submit(new MyRunnable());
//		Future<String> future = executorService.submit(new MyCallable());
//		System.out.println(ANSI_RESET + future.get());
//		System.out.println(ANSI_RESET + "Total number threads scheduled): " + mypool.getTaskCount());
//		System.out.println(ANSI_RESET + "size of mypool: " + mypool.getPoolSize());
//		executorService.shutdown();

		/** ScheduledExecutorService Demo **/
//		System.out.println(ANSI_RESET + "************** ScheduledExecutorService **************");
//		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//		scheduledExecutorService.scheduleAtFixedRate(new MyRunnable(), 1, 5, TimeUnit.SECONDS);
//		Future<String> resultFuture2 = scheduledExecutorService.schedule(new MyCallable(), 5000,TimeUnit.MILLISECONDS);
//		System.out.println(ANSI_RESET + resultFuture2.get());
//		scheduledExecutorService.shutdown();

		/** Creating a ScheduledThreadPoolExecutor object **/
		System.out.println(ANSI_RESET + "************** ScheduledThreadPoolExecutor **************");
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2);
//
//		scheduledThreadPoolExecutor.schedule(new ThreadA(), 2, TimeUnit.SECONDS);
//		scheduledThreadPoolExecutor.scheduleAtFixedRate(new ThreadA(), 2, 4, TimeUnit.SECONDS);

		ScheduledFuture<String> scheduledFuture = scheduledThreadPoolExecutor.schedule(new MyCallable(), 5,
				TimeUnit.SECONDS);
		String sVal = scheduledFuture.get();
		System.out.println(ANSI_RESET + "ScheduledFuture Value : " + sVal);
		scheduledThreadPoolExecutor.shutdown();
	}
}

/** Runnable Implementation */
class MyRunnable implements Runnable {

	public void run() {
		System.out.println(":::::: My Runnable running ::::::  .....");
	}
}

/** Callable Implementation */
class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(":::::: My MyCallable running :::::: .....");
		return "Hello World";
	}
}
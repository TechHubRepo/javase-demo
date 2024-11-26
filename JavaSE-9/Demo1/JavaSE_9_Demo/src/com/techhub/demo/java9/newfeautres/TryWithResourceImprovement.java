package com.techhub.demo.java9.newfeautres;

import java.io.Closeable;
import java.io.IOException;

public class TryWithResourceImprovement {

	public static void main(String[] args) {

		MyResource myResource = new MyResource();

		try (myResource) {
			System.out.println(":::: Operation on MyResource Begin ::::");
			int x = 10;
			int y = 50;
			int sum = myResource.add(x, y);
			System.out.println("SUM ::: " + sum);
			System.out.println(":::: Operation on MyResource Ends ::::");
//			throw new Exception("smaple");
		} catch (Exception e) {
			System.out.println("EXCEPTION " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("::::: EXIT :::::");
	}
}

class MyResource implements Closeable {

	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public void close() throws IOException {
		System.out.println("MyResource :::: CLOSED");
	}
}

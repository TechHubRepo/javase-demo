package com.techhub.javasedemo.generic;

public class MyStorageMain {

	public static void main(String[] args) {

		MyStorage<Integer> myStorage = new MyStorage<>(4552);

		int data = (int)myStorage.getData();
		System.out.println("data : " + data);

	}
}

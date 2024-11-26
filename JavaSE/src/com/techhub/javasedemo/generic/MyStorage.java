package com.techhub.javasedemo.generic;

public class MyStorage<T> {

	private T data;

	public MyStorage(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data.toString();
	}
}

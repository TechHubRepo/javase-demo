package com.techhub.java8.features.thisinmethodparam;

public class Hello {

	private String message;

	public Hello() {
		super();
	}

	public Hello(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
}

package com.techhub.javasedemo.generic;

public class AlphaMain {
	
	public static void main(String[] args) {
		Alpha<AlphaWriter> alpha = new Alpha<AlphaWriter>(new AlphaWriter());
		System.out.println(alpha);
	}
}

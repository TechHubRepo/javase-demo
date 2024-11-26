package com.techhub.javasedemo.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TryCatchMain2 {

	public static void main(String[] args) {
		System.out.println("************ Program Started ************");

		try {
			File file = new File("/abc/xyz/myfile.txt");
			InputStream inputStream = new FileInputStream(file);
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("************ Program Ended ************");
	}

}

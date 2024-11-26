package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class ByteStream_ObjectInputStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Pointing the Object file */
		File objectFile = new File(RootPath.ROOT, "Person.obj");

		/** Creating InputStream for Object file */
		InputStream inputStream = new FileInputStream(objectFile);

		/** Creating ObjectInputStream for InputStream of Object file */
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

		/** Reading the Person Object from ObjectInputStream */
		Person person = (Person) objectInputStream.readObject();
		
		/** Closing the ObjectInputStream */
		objectInputStream.close();
		
		/** Printing the Person Object */
		System.out.println(person);
	}
}
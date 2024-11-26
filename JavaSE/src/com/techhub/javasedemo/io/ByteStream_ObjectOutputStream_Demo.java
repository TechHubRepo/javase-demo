package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class ByteStream_ObjectOutputStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Creating the Object file **/
		File objectFile = new File(RootPath.ROOT, "Person.obj");
		
		/** Creating OutputStream for Object file **/
		OutputStream outputStream = new FileOutputStream(objectFile);
		
		/** Creating ObjectOutputStream for OutputStream of Object file **/
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		
		/** Creating the Person Object to write **/
		Person person = new Person("Krishna", (byte) 26, 'M', 6521423598l, true);
		System.out.println(person);

		/** Writing the Person Object to ObjectOutputStream**/
		objectOutputStream.writeObject(person);
		
		/** Flushing the ObjectOutputStream**/
		objectOutputStream.flush();
		
		/** Closing the ObjectOutputStream**/
		objectOutputStream.close();

		System.out.println("**** Object I/O operation completed ****");		
	}
}
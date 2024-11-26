package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class ByteStream_ByteArrayStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Creating data to stream **/
		byte[] inputData = { 'a', 'b', 'c', 'd', 'e', 'f' };

		/** Creating Output Data Storage **/
		byte[] outputData = new byte[6];

		/** Creating an ByteArrayInputStream for byte data **/
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(inputData);
		
		/** Reading the bytes data from ByteArrayInputStream **/
		byteArrayInputStream.read(outputData);
		
		/** Closing the ByteArrayInputStream **/
		byteArrayInputStream.close();
		
		/** Printing output data */
		for(byte b:outputData) {
			System.out.println( b);
		}
	
		/** Creating an ByteArrayOutputStream for byte data **/
		ByteArrayOutputStream byArrayOutputStream = new ByteArrayOutputStream();
		
		/** Writing byte array data to  an ByteArrayOutputStream **/
		byArrayOutputStream.write(outputData);
		
		/** Creating an Output file for byte output data **/
		File byteArrayOutputFile = new File(RootPath.ROOT, "/ByteArrayStream_Output_File.txt");

		/** Creating the OutputStream for file to write the output data **/
		OutputStream outputStream = new FileOutputStream(byteArrayOutputFile);

		/** Writing the bytes data to OutputStream **/
		byArrayOutputStream.writeTo(outputStream);
		
		/** Flushing the ByteArrayOutputStream **/
		byArrayOutputStream.flush();
		
		/** Closing the ByteArrayOutputStream **/
		byArrayOutputStream.close();
		
		System.out.println("**** Byte data I/O operation completed ****");
	}
}
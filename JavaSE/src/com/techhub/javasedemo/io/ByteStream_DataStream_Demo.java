package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class ByteStream_DataStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Pointing input file to read the byte data */
		File inputFile = new File(RootPath.ROOT, "/DataStream_Input_File.txt");
		
		/** Creating an InputStrem of byte data for input file */
		InputStream inputStream = new FileInputStream(inputFile);
		
		/** Creating an DataInputStream for byte data of FileInputStream */
		DataInputStream dataInputStream=new DataInputStream(inputStream);
	
		/** Creating output file to write the byte data */
		File outputFile = new File(RootPath.ROOT, "/DataStream_Output_File.txt");
		
		/** Creating an OutputStream of byte data for output file */
		OutputStream outputStream = new FileOutputStream(outputFile);
		
		/** Creating an DataInputStream for byte data of FileInputStream */
		DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
		
		System.out.println("Number of bytes available to read = "+ dataInputStream.available());
		
		/** Reading integer value from DataInputStream */
		int intValue=dataInputStream.readInt();
		/** Writing integer value to DataOutputStream */
		dataOutputStream.writeInt(intValue);
		
		/** Reading double value from DataInputStream */
		double doubleValue=dataInputStream.readDouble();
		/** Writing double value to DataOutputStream */
		dataOutputStream.writeDouble(doubleValue);
		
		/** Reading character value from DataInputStream */
		char charValue=dataInputStream.readChar();
		/** Writing character value to DataOutputStream */
		dataOutputStream.writeChar(charValue);
		
		/** Reading boolean value from DataInputStream */
		boolean booleanValue=dataInputStream.readBoolean();
		/** Writing boolean value to DataOutputStream */
		dataOutputStream.writeBoolean(booleanValue);
		
		/** Reading long value from DataInputStream */
		long longValue=dataInputStream.readLong();
		/** Writing long value to DataOutputStream */
		dataOutputStream.writeLong(longValue);
		
		/** Flushing the DataOutputStream */
		dataOutputStream.flush();
		
		/** Closing the DataOutputStream */
		dataOutputStream.close();
		
		/** Closing the DataOutputStream */
		dataInputStream.close();
		
		System.out.println("**** Byte data I/O operation completed ****");		
	}
}
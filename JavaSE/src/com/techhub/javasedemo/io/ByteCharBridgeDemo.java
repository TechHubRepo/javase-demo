package com.techhub.javasedemo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import com.techhub.javasedemo.langpackage.RootPath;

public class ByteCharBridgeDemo {

	public static void main(String[] args) throws Exception {

		/** Pointing to an Input file for InputStream */
		File inputFile = new File(RootPath.ROOT, "/InputStreamReader_Input_File.txt");

		InputStream inputStream = new FileInputStream(inputFile);
		
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		File outputFile = new File(RootPath.ROOT, "/OutputStreamWriter_Output_File.txt");
		
		OutputStream outputStream=new FileOutputStream(outputFile);
		
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);
		
		char[] buffer=new char[127];
		int index=0;
		while((index=inputStreamReader.read(buffer))>-1) {
			outputStreamWriter.write(buffer, 0, index);
		}

		outputStreamWriter.flush();
		outputStreamWriter.close();
		inputStreamReader.close();
		
		System.out.println("**** Object I/O operation completed ****");
	}

}

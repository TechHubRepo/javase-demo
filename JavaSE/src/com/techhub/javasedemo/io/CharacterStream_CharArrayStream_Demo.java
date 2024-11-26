package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class CharacterStream_CharArrayStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Creating Character array Input */
		char cArrIn[] = { 'X', 'Y', 'Z', 'P', 'Q', 'R' };

		/** Creating Character array Output storage */
		char cArrOut[] = new char[6];

		/** Creating CharArrayReader from input character array */
		CharArrayReader arrayReader = new CharArrayReader(cArrIn);

		/** Reading from CharArrayReader */
		arrayReader.read(cArrOut);
	
		/** Creating output file to write the character data */
		File outputFile = new File(RootPath.ROOT, "/CharArrayStream_Output_File.txt");

		/** Creating the Writer Object of character stream data for input file */
		Writer writer = new FileWriter(outputFile);

		/** Creating CharArrayWriter to write the character array data */
		CharArrayWriter arrayWriter = new CharArrayWriter();

		/** Writing data to CharArray */
		arrayWriter.write(cArrOut);

		/** Writing data to Writer */
		arrayWriter.writeTo(writer);

		/** Flushing and closing to Writer, CharArrayWriter and CharArrayReader */
		writer.flush();
		writer.close();
		arrayWriter.flush();
		arrayWriter.close();
		arrayReader.close();

		System.out.println("**** Object I/O operation completed ****");
	}
}

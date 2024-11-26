package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class CharacterStream_FileStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Pointing input file to read the character data */
		File inputFile = new File(RootPath.ROOT, "/CharacterStream_Input_File.txt");

		/** Creating the Reader Object of character stream data for input file */
		Reader reader = new FileReader(inputFile);

		/** Creating output file to write the character data */
		File outputFile = new File(RootPath.ROOT, "/CharacterStream_Output_File.txt");

		/** Creating the Writer Object of character stream data for input file */
		Writer writer = new FileWriter(outputFile);

		/** Character buffer to read and write the data  */
		char buffer[] = new char[127];
		
		/** Index to count the bytes to read the data  */
		int index = 0;
		
		/** Reading the whole file till end */
		while ((index = reader.read(buffer)) > 0) {
			
			/** Printing the index of character count */
			System.out.println("Index : " + index);
			
			/** Writing the characters to Writer */
			writer.write(buffer, 0, index);
		}
		
		/** Flushing the Writer */
		writer.flush();
		
		/** Closing the Writer */
		writer.close();
		
		/** Closing the Reader */
		reader.close();
		
		System.out.println("**** Object I/O operation completed ****");
	}
}

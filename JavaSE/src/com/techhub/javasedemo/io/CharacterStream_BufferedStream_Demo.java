package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class CharacterStream_BufferedStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Pointing input file to read the character data */
		File inputFile = new File(RootPath.ROOT, "/CharacterStream_Input_File.txt");

		/** Creating the Reader Object of character stream data for input file */
		Reader reader = new FileReader(inputFile);
		
		/** Creating the BufferedReader Object from Reader */
		BufferedReader bufferedReader=new BufferedReader(reader);

		/** Creating output file to write the character data */
		File outputFile = new File(RootPath.ROOT, "/CharacterStream_Output_File2.txt");

		/** Creating the Writer Object of character stream data for input file */
		Writer writer = new FileWriter(outputFile);
		
		/** Creating the BufferedWriter for Writer*/
		BufferedWriter bufferedWriter=new BufferedWriter(writer);
	
		String line=null;
		
		/** Reading the whole file till end */
		while ((line=bufferedReader.readLine())!=null) {
			
			/** Printing the Line */
			System.out.println("Line : " + line);
			
			/** Writing the characters to Writer */
			writer.write(line);
		}
		
		/** Flushing the BufferedWriter */
		bufferedWriter.flush();
		
		/** Closing the BufferedWriter */
		bufferedWriter.close();
		
		/** Closing the BufferedReader */
		bufferedReader.close();
	}
}

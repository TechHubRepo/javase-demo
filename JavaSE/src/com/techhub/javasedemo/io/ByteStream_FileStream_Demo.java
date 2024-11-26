package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class ByteStream_FileStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Pointing to input file to read the byte data */
		File inputFile = new File(RootPath.ROOT, "/Player.png");
		
		/** Creating an InputStrem of byte data for input file*/
		InputStream inputStream = new FileInputStream(inputFile);
		
		/** Reading all the bytes from InputStream of file **/
		byte[] data = inputStream.readAllBytes();
		
		/** Closing the InputStream (can be replaced to try with resource statement) */
		inputStream.close();
		
		System.out.println("**** Byte data reading operation completed ****");
		
		/** Creating output file to write the byte data */
		File outputFile = new File(RootPath.ROOT, "/FileStream_Output_File_Player.png");
		
		/** Creating an OutputStream of byte data for output file */
		OutputStream outputStream = new FileOutputStream(outputFile);
		
		/** Writing the bytes data to OutputStream of file */
		outputStream.write(data);
		
		/** Flushing the OutputStream */
		outputStream.flush();
		
		/** Closing the OutputStream (can be replaced to try with resource statement) */
		outputStream.close();
		
		System.out.println("**** Byte data writing operation completed ****");		
	}
}

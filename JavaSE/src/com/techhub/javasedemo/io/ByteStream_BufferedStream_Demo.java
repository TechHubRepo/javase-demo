package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class ByteStream_BufferedStream_Demo {

	public static void main(String[] args) throws Exception {

		/** Pointing input file to read the byte data */
		File inputFile = new File(RootPath.ROOT, "/Player.png");

		/** Creating an InputStrem of byte data for input file */
		InputStream inputStream = new FileInputStream(inputFile);

		/** Creating a BufferedInputStream of byte data for FileInputStream */
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

		/** Reading all the bytes from InputStream of file */
		byte[] data = bufferedInputStream.readAllBytes();

		/** Closing the InputStream (can be replaced to try with resource statement) */
		bufferedInputStream.close();

		System.out.println("**** Byte data reading operation completed  ****");

		/** Creating output file to write the byte data */
		File outputFile = new File(RootPath.ROOT, "/BufferedStream_Output_File_Player.png");

		/** Creating an OutputStream of byte data for output file */
		OutputStream outputStream = new FileOutputStream(outputFile);

		/** Creating a BufferedOutputStream of byte data for FileOutputStream */
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

		/** Writing the bytes data to OutputStream of file */
		bufferedOutputStream.write(data);

		/** Flushing the OutputStream */
		bufferedOutputStream.flush();

		/** Closing the OutputStream (can be replaced to try with resource statement) */
		bufferedOutputStream.close();

		System.out.println("**** Byte data writing operation completed ****");
	}
}

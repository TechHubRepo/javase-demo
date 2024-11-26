package com.techhub.javasedemo.io;

import java.io.*;

import com.techhub.javasedemo.langpackage.RootPath;

public class TryWithResourceDemo {

	public static void main(String[] args) throws Exception {

		/** InputStrem for byte data */
		File inputFile = new File(RootPath.ROOT, "/Player.png");

		/** OutputStream for byte data */
		File outputFile = new File(RootPath.ROOT, "/Try_With_Resource_player.png");

		try (InputStream inputStream = new FileInputStream(inputFile);
				OutputStream outputStream = new FileOutputStream(outputFile);) {
			byte[] data = inputStream.readAllBytes();
			outputStream.write(data);
			outputStream.flush();
		}
		
		System.out.println("**** Data reading and writing completed ****");
	}
}

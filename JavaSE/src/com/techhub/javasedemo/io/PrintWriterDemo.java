package com.techhub.javasedemo.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.techhub.javasedemo.langpackage.RootPath;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {

		/** Creating Output file for PrintWriter */
		File outputFile = new File(RootPath.ROOT, "/PrintWriter_Output_File.txt");

		/** Creating PrintWriter from File */
//		PrintWriter printWriter = new PrintWriter(outputFile);

		/** Creating PrintWriter from OutputStream of File */
//		PrintWriter printWriter=new PrintWriter(new FileOutputStream(outputFile));

		/** Creating PrintWriter from Writer of File */
		PrintWriter printWriter=new PrintWriter(new FileWriter(outputFile));

		/** Writing to PrintWriter */
		printWriter.write("Hello World again");

		/** Flushing and closing PrintWriter */
		printWriter.flush();
		printWriter.close();
	}
}

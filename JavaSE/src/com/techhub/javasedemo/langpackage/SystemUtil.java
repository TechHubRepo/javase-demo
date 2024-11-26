package com.techhub.javasedemo.langpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public final class SystemUtil {

	private SystemUtil() {
	}

	/**
	 * Change the default out (print stream to file)
	 */
	public static final void changeOut() {
		File file = new File(RootPath.ROOT + "console.txt");
		try {
			PrintStream printStream = new PrintStream(file);
			System.setOut(printStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Change the default err (print stream to file)
	 */
	public static final void changeErr() {
		File file = new File(RootPath.ROOT + "err-console.txt");
		try {
			PrintStream printStream = new PrintStream(file);
			System.setErr(printStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Change the default in (input stream from file)
	 */
	public static final void changeIn() {
		File file = new File(RootPath.ROOT + "input.txt");
		try {
			InputStream inputStream = new FileInputStream(file);
			System.setIn(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

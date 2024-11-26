package com.techhub.javasedemo.langpackage.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReluctantQuantifier {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	public static void main(String[] args) {

		/** The regex array */
		String regexArray[] = { "[g]+?",".*?foo"};

		/** The regex */
		String regex = regexArray[0];

		/** The value to test for regex */
		String inputs[] = {"ggg"};

		Pattern pattern = Pattern.compile(regex);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Regular expression = " + regex);
		System.out.println("-----------------------------------------------------------------");
		for (String input : inputs) {
			Matcher matcher = pattern.matcher(input);
			System.out.println(input);
			while (matcher.find()) {
				System.out.println(ANSI_GREEN + "Pattern found from " + matcher.start() + " to " + (matcher.end() - 1));
			}
		}
	}
}

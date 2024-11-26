package com.techhub.javasedemo.langpackage.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	public static void main(String[] args) {

		/** The regex array */
		String regexArray[] = { "[abc]", "[^abc]", "[a-f]", "[a-fG-L]", "[a-d[m-p]]", "[a-z&&[def1]]",
				"[[axytb]&&[yhbur]]", "[a-z&&[^bc]]", "[a-z&&[^m-p]]", "ab.z", "[\\d]", "[0-9]", "[\\D]", "[\\w]","[\\W]",
				"[a]?", "[a]*", "[a]+", "[a]{4}", "[a]{3,}", "[a]{2,5}", "[a]?[bc]", "abc", "a|b|c", "(a|b)(b|a)" };

		/** The regex */
		String regex = regexArray[24];

		/** The value to test for regex */
		String inputs[] = { "abc","abcd","abcde","a","b","c","ab","ba","aa","bb"};

		Pattern pattern = Pattern.compile(regex);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Regular expression = " + regex);
		System.out.println("-----------------------------------------------------------------");
		for (String input : inputs) {
			Matcher matcher = pattern.matcher(input);
			boolean b = matcher.matches();
			if (b) {
				System.out.println(ANSI_GREEN + input + " = " + b);
			} else {
				System.err.println(ANSI_RED + input + " = " + b);
			}
		}
	}
}

package com.techhub.javasedemo.langpackage.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRegex {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	public static void main(String[] args) {

		/** The regex array */
		/**
		*		^                 						# start-of-string
		*		(?=.*[0-9])       				# a digit must occur at least once
		*		(?=.*[a-z])       				# a lower case letter must occur at least once
		*		(?=.*[A-Z])       				# an upper case letter must occur at least once
		*		(?=.*[@#$%^&+=])  	# a special character must occur at least once
		*		(?=\S+$)          				# no whitespace allowed in the entire string
		*		.{8,}            						# anything, at least eight places though
		*		$                 						# end-of-string
		 */
		String regexArray[] = { "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$" ,"[0-9]{10}","[a-z]+[a-zA-Z_0-9]*[@][a-z]*.com"};
		

		/** The regex */
		String regex = regexArray[2];

		/** The value to test for regex */
		String values[] = { "abcDFE#$123", "45456456","1452854785","addED#$567","abc12@gmail.com"};

		Pattern pattern = Pattern.compile(regex);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Regular expression = " + regex);
		System.out.println("-----------------------------------------------------------------");
		for (String value : values) {
			Matcher matcher = pattern.matcher(value);
			boolean b = matcher.matches();
			if (b) {
				System.out.println(ANSI_GREEN + value + " = " + b);
			} else {
				System.err.println(ANSI_RED + value + " = " + b);
			}
		}
	}
}

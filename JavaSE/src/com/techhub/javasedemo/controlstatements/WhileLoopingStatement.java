package com.techhub.javasedemo.controlstatements;

public class WhileLoopingStatement {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int sum;
		int total = 15;
		int i = 1;
		System.out.print(number1);
		while (i < total) {
			sum = number1 + number2;
			System.out.print(", " + number2);
			number1 = number2;
			number2 = sum;
			i = i + 1;
		}
		
		
		do {
			
		}while(true);
	}
}

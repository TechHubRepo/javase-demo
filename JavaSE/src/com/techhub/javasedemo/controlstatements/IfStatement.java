package com.techhub.javasedemo.controlstatements;

public class IfStatement {

	public static void main(String[] args) {
		int x=3;
		int y=5;
		
		if(x==0) {
			System.out.println("Power is off");
		}else if(x==1) {
			System.out.println("Power is on");
		}else if(y==2) {
			System.out.println("X is 2");
		}else {
			System.out.println("Default");
		}
		
		System.out.println("************************");
		
		boolean flag=true;
		if(flag) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}

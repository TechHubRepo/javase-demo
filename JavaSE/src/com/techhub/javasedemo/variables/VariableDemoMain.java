package com.techhub.javasedemo.variables;

public class VariableDemoMain {

	public static void main(String[] args) {

		System.out.println("MaxLength = "+VariableDemo.getMaxLength());
		VariableDemo.setMaxLength((byte) 50);
		System.out.println("MaxLength = "+VariableDemo.getMaxLength());

		System.out.println("Person = " + VariableDemo.getPerson());

		VariableDemo demo = new VariableDemo();
		System.out.println("Student = " + demo.getStudent());
		demo.setaVar(7);
		demo.setbVar(3);

		System.out.println("A = " + demo.getaVar());
		System.out.println("B = " + demo.getbVar());

		System.out.println("Swapping .....");
		demo.swapToAvarAndBvar();

		System.out.println("A = " + demo.getaVar());
		System.out.println("B = " + demo.getbVar());
	}
}

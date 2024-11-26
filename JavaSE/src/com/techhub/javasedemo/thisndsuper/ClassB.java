package com.techhub.javasedemo.thisndsuper;

public class ClassB extends ClassA {

	private int var1;
	private int var2;

	public ClassB() {
		super();
	}

	public ClassB(int var1, int var2) {
		super(var1, var2);
	}

	public ClassB(int var1, int varB1, int varB2) {
		super(var1);
		this.var1 = varB1;
		this.var2 = varB2;
	}

	public ClassB(int var1, int var2, int varB1, int varB2) {
		super(var1, var2);
		this.var1 = varB1;
		this.var2 = varB2;
	}

	public int getSum(ClassB this) {
		return this.var1 + this.var2 + super.getSum();
	}

	@Override
	public String toString() {
		return "ClassB [var1=" + var1 + ", var2=" + var2 + "] , " + super.toString();
	}
}

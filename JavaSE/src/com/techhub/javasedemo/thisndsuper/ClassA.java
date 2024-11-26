package com.techhub.javasedemo.thisndsuper;

public class ClassA {

	private int var1;
	private int var2;

	public ClassA() {
	}

	public ClassA(int var1) {
		this(var1, 0);
	}

	public ClassA(int var1, int var2) {
		this.var1 = var1;
		this.var2 = var2;
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2(ClassA this) {
		return var2;
	}

	public void setVar2(ClassA this,int var2) {
		this.var2 = var2;
	}

	public int getSum(ClassA this) {
		return this.var1 + var2;
	}

	@Override
	public String toString() {
		return "ClassA [var1=" + var1 + ", var2=" + var2 + "]";
	}
}

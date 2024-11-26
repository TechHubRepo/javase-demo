package com.techhub.javasedemo.variables;

public class LiteralsDemo {

	public static void main(String[] args) {

		System.out.println("************** int literals **************");
		
		int a=86;
		int b=0b1010110;
		int c=0126;
		int d=0x56;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		System.out.println("************** char literals **************");
		
		char k = 'K';
		char k2 = '\u0915';
		
		System.out.println("k = " + k);
		System.out.println("k2 = " + k2);
		
		System.out.println("************** String literals **************");
		
		String s = "BHARAT";
		String s2 ="\u092D\u093E\u0930\u0924";
		
		System.out.println("s = " + s); 
		System.out.println("s2 = " + s2); 
		
		System.out.println("************** boolean literals **************");
		boolean t=true;
		boolean t2=false;
		
		System.out.println("t = " + t); 
		System.out.println("t2 = " + t2); 
		
		System.out.println("************** float literals **************");
		
		float f=1.5e3f;
		float f2=1.5e-3f;
		System.out.println("f = " +f); 
		System.out.println("f2 = " +f2); 
	}
}
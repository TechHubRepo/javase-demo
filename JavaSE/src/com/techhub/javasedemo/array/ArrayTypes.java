package com.techhub.javasedemo.array;

public class ArrayTypes {

	public static void main(String[] args) {

		System.out.println("***************** One dimensional Array *****************");
		byte[] bArr = { 10, 6, 4, 7, 2, 5 };
			
		System.out.println(bArr[0]);
		System.out.println(bArr[3]);
		System.out.println(bArr[4]);

		System.out.println("***************** Two dimensional Array *****************");
		byte[][] bArr2 = {{11,22},{33,44},{55,66}};

		
		System.out.println(bArr2[0][0]);
		System.out.println(bArr2[1][1]);
		System.out.println(bArr2[2][0]);

		
		
		System.out.println("***************** Multidimensional dimensional Array *****************");
		byte[][][] bArr3 = {{{12,18}},{{22,28}}};
		
		System.out.println(bArr3[0][0][1]);
		System.out.println(bArr3[1][0][0]);
		
	}
}

package com.techhub.javasedemo.array;

public class ArrayTypes2 {

	public static void main(String[] args) {

		System.out.println("***************** One dimensional Array *****************");
		byte[] bArr = new byte[5];

		bArr[0] = 10;
		bArr[1] = 6;
		bArr[2] = 4;
		bArr[3] = 7;
		bArr[4] = 2;
				
		System.out.println(bArr[0]);
		System.out.println(bArr[3]);
		System.out.println(bArr[4]);

		System.out.println("***************** Two dimensional Array *****************");
		byte[][] bArr2 = new byte[5][7];

		bArr2[0][3]=12;
		bArr2[1][2]=15;
		bArr2[2][4]=18;
		bArr2[3][1]=20;
		
		System.out.println(bArr2[0][3]);
		System.out.println(bArr2[1][2]);
		System.out.println(bArr2[2][4]);
		System.out.println(bArr2[3][1]);
		
		
		System.out.println("***************** Multidimensional dimensional Array *****************");
		byte[][][] bArr3 = new byte[5][2][3];
		
		bArr3[0][0][1]=12;
		bArr3[4][1][2]=15;
		
		System.out.println(bArr3[0][0][1]);
		System.out.println(bArr3[4][1][2]);
		
		
		System.out.println("***************** Multidimensional dimensional Array2 *****************");
		byte[][][][] bArr4 = new byte[5][2][3][2];
		
		bArr4[0][1][1][0]=100;
		System.out.println(bArr4[0][1][1][0]);
	}
}

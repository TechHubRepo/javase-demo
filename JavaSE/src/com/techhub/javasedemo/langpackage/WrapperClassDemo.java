package com.techhub.javasedemo.langpackage;

public class WrapperClassDemo {

	public static void main(String[] args) {

//		Number number = 45;

		System.out.println(" ***********  Converting form String or Primptive to Wrapper type.  *********** ");
		Byte b = Byte.valueOf("120");
		Short s = Short.valueOf((short) 521);
		Integer i = 45646;
		Long l = 456465456454l;
		Float f = 4564.51f;
		Double d = 1654.56;

		Character c = 'B';
		Boolean bo = true;

		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		System.out.println("c : " + c);
		System.out.println("bo : " + bo);

		System.out.println(" *********** Converting Wrapper to Primptive type.  *********** ");
		byte b2 = i.byteValue();
		double d2 = i.doubleValue();
		int i2 = i.intValue();
		System.out.println("b2 : " + b2);
		System.out.println("d2 : " + d2);
		System.out.println("i2 : " + i2);

		System.out.println(" *********** Converting From String to Primptive type.  *********** ");
		String num = "50";
		int i3 = Integer.parseInt(num);
		System.out.println("i3 : " + i3);

		byte b3 = Byte.parseByte(num);
		System.out.println("b3 : " + b3);

		System.out.println(" *********** Converting From Wrappet to String type.  *********** ");
		String iStr = i.toString();
		System.out.println("iStr : " + iStr);
		String iStr2 = String.valueOf(i);
		System.out.println("iStr2 : " + iStr2);

		System.out.println(" *********** Converting From Primptive to String type.  *********** ");

		int x = 600;
		String iStr3=String.valueOf(x);
		System.out.println("iStr3 : " + iStr3);
	}

}

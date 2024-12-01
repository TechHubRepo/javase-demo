package com.techhub.demo.java9.module;

import com.techhub.util.common.ObjectUtil;
import com.techhub.util.math.MathUtil;


/**
 * The main class
 * 
 * @author ramniwash
 *
 */
public class MainClass {

	public static void main(String[] args) {
		int sum=MathUtil.add(10,30);
		System.out.println("sum : "+sum);
		int substraction=MathUtil.substract(10,30);
		System.out.println("substraction : "+substraction);			
				

		System.out.println(ObjectUtil.isNull(new Object()));
		System.out.println(ObjectUtil.isNull(null));
	}
}

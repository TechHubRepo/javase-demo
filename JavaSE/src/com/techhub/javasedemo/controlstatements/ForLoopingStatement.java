package com.techhub.javasedemo.controlstatements;

public class ForLoopingStatement {

	public static void main(String[] args) {

		int[] nums= {34,98,77,86,24};
		
		for (int i = 0; i < nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		for(int n:nums) {
			System.out.println(n);
		}
	}
}

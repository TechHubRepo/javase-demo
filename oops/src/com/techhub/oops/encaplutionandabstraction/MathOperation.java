package com.techhub.oops.encaplutionandabstraction;

/**
 * The MathOperation class
 * 
 * @author ramniwash
 *
 */
public class MathOperation {

	/** The x field for number x */
	private int x;

	/** The y field for number y */
	private int y;

	public MathOperation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Do the addition of x and y
	 * 
	 * @return int the sum of x and y
	 */
	public int addition() {
		return this.x + this.y;
	}

	/**
	 * Do the subtraction of x and y
	 * 
	 * @return int the subtraction of x and y
	 */
	public int subtraction() {
		return this.x - this.y;
	}

	/**
	 * Do the multiplication of x and y
	 * 
	 * @return int the multiplication of x and y
	 */
	public int multiplication() {
		return this.x * this.y;
	}

	/**
	 * Do the division of x and y
	 * 
	 * @return int the division of x and y
	 */
	public int division() {
		return this.x / this.y;
	}
}

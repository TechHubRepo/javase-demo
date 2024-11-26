package com.techhub.oops.encaplutionandabstraction;

/**
 * The MainClass
 * 
 * @author ramniwash
 *
 */
public class MainClass {

	/**
	 * The Starting point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** Creating the MathOperation object */
		MathOperation mathOperation = new MathOperation(18, 6);

		/* Getting the addition of 18 and 6 */
		int addition = mathOperation.addition();
		/* Print the addition of 18 and 6 */
		System.out.println("Addition (18,6) : " + addition);

		/* Getting the subtraction of 18 and 6 */
		int subtraction = mathOperation.subtraction();
		/* Print the subtraction of 18 and 6 */
		System.out.println("Subtraction (18,6) : " + subtraction);

		/* Getting the multiplication of 18 and 6 */
		int multiplication = mathOperation.multiplication();
		/* Print the subtraction of 18 and 6 */
		System.out.println("Multiplication (18,6) : " + multiplication);

		/* Getting the division of 18 and 6 */
		int division = mathOperation.division();
		/* Print the subtraction of 18 and 6 */
		System.out.println("Division (18,6) : " + division);
	}
}

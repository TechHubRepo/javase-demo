package com.util;

public class MathOpr {

    private static final int NUMBER_0 = 0;

    private static final int NUMBER_1 = 1;

    public int additionOf(int... numbers) {
        int sum = NUMBER_0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int subtractionOf(int... numbers) {
        int subtraction = NUMBER_0;
        for (int number : numbers) {
            subtraction -= number;
        }
        return subtraction;
    }

    public int multiplicationOf(int... numbers) {
        int multiplication = NUMBER_1;
        for (int number : numbers) {
            multiplication *= number;
        }
        return multiplication;
    }

    public double divisionOf(int... numbers) {
        double division = NUMBER_1;
        for (int number : numbers) {
            division /= number;
        }
        return division;
    }
}

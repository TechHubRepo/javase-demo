package com.mymoda;

import com.my.modc.math.MathOpr;
import com.my.modc.util.LogPrinter;
import com.techhub.pa.MathUtil;

public class Main {

    public static void main(String[] args) {
        int sum = MathUtil.sumOfNumbes(40,10,30,20);
        LogPrinter.printInfo("\nSUM = ");
        LogPrinter.printInfo(sum);

        MathOpr mathOpr = new MathOpr();
        int multiplication = mathOpr.multiplicationOf(2,3,4,2);
        LogPrinter.printInfo("\nMultiplication = ");
        LogPrinter.printInfo(multiplication);
    }
}

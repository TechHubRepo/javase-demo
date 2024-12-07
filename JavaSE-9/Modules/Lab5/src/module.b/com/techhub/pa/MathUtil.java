package com.techhub.pa;

import com.my.modc.math.MathOpr;
import com.my.modc.util.LogPrinter;

public final class MathUtil {

    private static final MathOpr math = new MathOpr();

    public static int sumOfNumbes(int... numbers) {
        int sum = math.additionOf(numbers);
        LogPrinter.printInfo("SUM {MOD B} = " ,sum);
        return sum;
    }
}

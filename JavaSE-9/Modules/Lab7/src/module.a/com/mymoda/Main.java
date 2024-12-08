package com.mymoda;

import com.techhub.pa.MathUtil;
import com.my.modc.util.LogPrinter;

public class Main {

    public static void main(String[] args) {
        int sum = MathUtil.sumOfNumbes(40,10,30,20);
        LogPrinter.printInfo("\n-----------------\n");
        LogPrinter.printInfo("SUM = ");
        LogPrinter.printInfo(sum);
        LogPrinter.printInfo("\n-----------------\n");
    }
}

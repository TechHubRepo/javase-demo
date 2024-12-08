package org.main.demo;

import com.greetings.Hello;
import com.util.LogPrinter;
import com.util.MathOpr;
//import com.testp.Hi;

public class Main {
    public static void main(String[] args) {

        Hello hello = new Hello();

        LogPrinter.printInfo(hello.getMessage());

        MathOpr mathOpr = new MathOpr();

        LogPrinter.printInfo("\n-------\nSUM = ", mathOpr.additionOf(10, 20, 30, 40), "\n-------");

        //Hi hi = new Hi();
    }
}
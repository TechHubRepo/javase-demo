package com.my.modc.util;

public class LogPrinter {

    public static void printInfo(Object ... messages){
        for(Object message : messages) {
            System.out.print(message);
        }
    }

    public static void printError(Object ... messages){
        for(Object message : messages) {
            System.err.print(message);
        }
    }
}

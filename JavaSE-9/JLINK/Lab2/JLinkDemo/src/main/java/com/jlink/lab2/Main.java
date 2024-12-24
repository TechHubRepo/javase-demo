package com.jlink.lab2;

import java.util.logging.Logger;


public class Main {

    private static final Logger LOG = Logger.getLogger("MAIN");

    public static void main(String[] args) {

        StringBuilder messageBuilder = new StringBuilder("\n-------------------------------\nHello, Welcome to My Mini JRE\n-------------------------------");
        for (int i = 1; i <= 10; i++) {
            messageBuilder.append("\n").append("I = ").append(i);
        }
        messageBuilder.append("\n-------------------------------\nEND\n-------------------------------");
        String message = messageBuilder.toString();
        LOG.info(message);
    }
}
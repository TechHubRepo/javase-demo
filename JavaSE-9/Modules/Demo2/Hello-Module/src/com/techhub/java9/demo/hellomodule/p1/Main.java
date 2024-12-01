package com.techhub.java9.demo.hellomodule.p1;

import com.techhub.java9.demo.hellomodule.p2.Hello;

public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello();
        String message = hello.showMessage();
        System.out.println("Message = "+message);
    }
}

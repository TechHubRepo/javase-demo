package com.d;

import com.b.B;
import com.a.A;


public class MainClass {
    public static void main(String[] args) {
     String nameB=   B.name();
        String nameA =A.name();
        System.out.println("Name B : "+nameB);
        System.out.println("Name A : "+nameA);
    }
}

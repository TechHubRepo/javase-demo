package my.java9.features.streamapienhence;

import java.util.stream.Stream;

public class Lab2 {

    public static void main(String[] args) {
        System.out.println("In Java 1.8");
        Stream.iterate(1,x->x+1).limit(5).forEach(System.out::println);
        System.out.println("In Java 1.9");
        Stream.iterate(1, x->x<5, x->x+1).forEach(System.out::println);
    }
}


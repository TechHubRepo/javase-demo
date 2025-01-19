package my.java9.features.streamapienhence;

import java.util.List;

public class Lab1 {

    public static void main(String[] args) {

        List<Integer> list = List.of(2, 4, 1, 3, 6, 5, 8);

        List<Integer> list2 = list.stream().takeWhile(e -> e % 2 == 0).toList();
        List<Integer> list3 = list.stream().dropWhile(e -> e % 2 == 0).toList();

        System.out.println("ORIGINAL LIST " + list);
        System.out.println("takeWhile LIST " + list2);
        System.out.println("dropWhile LIST " + list3);
    }
}

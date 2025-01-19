package my.java9.features.streamapienhence;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lab3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add(null);
        list.add("C");
        list.add("D");
        list.add(null);
        list.add("E");

        System.out.println("ORIGINAL LIST :"+list);

        printListWithoutNullValue(list);

    }

    private static void printListWithoutNullValue(List<String> list){
        List<String> nullSafeList = list.stream().flatMap(e-> Stream.ofNullable(e)).toList();
        System.out.println("nullSafeList :"+nullSafeList);
    }
}

package my.java9.features.collectionfactorymethods;

import java.util.Map;

public class MapFactoryMethod {

    public static void main(String[] args) {
//        Map<String,String> map = Map.of("A","Apple","B","Banana","C","Cat");
//        Map<String,String> map = Map.of("A","1",
//                "B","2",
//                "C","3",
//                "D","4",
//                "E","5",
//                "F","6",
//                "G","7",
//                "H","8",
//                "I","9",
//                "J","10")

        Map<String, String> map = Map.ofEntries(Map.entry("A", "1"),
                Map.entry("B", "2"),
                Map.entry("C", "3"),
                Map.entry("D", "4"),
                Map.entry("E", "5"),
                Map.entry("F", "6"),
                Map.entry("G", "7"),
                Map.entry("H", "8"),
                Map.entry("I", "9"),
                Map.entry("J", "10"),
                Map.entry("K", "11"),
                Map.entry("L", "12"),
                Map.entry("M", "13"),
                Map.entry("N", "14"),
                Map.entry("O", "15"),
                Map.entry("P", "16"),
                Map.entry("Q", "17"),
                Map.entry("R", "18")
        );

        System.out.println(map);
    }
}

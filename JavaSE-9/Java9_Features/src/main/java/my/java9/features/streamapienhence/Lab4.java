package my.java9.features.streamapienhence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Lab4 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cat");
        map.put("E", null);
        map.put("F", "Fish");

        System.out.println("ORIGINAL VALUE " + map.values());
        List<String> values = map.entrySet().stream().flatMap(e -> {
            return Stream.ofNullable(e.getValue());
        }).toList();

        System.out.println("Null SAFE VALUE " + values);
    }
}

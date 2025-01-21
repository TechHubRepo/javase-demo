package my.java9.features.optionalenhenc;

import java.util.Optional;
import java.util.stream.Stream;

public class Lab1 {

    public static void main(String[] args) {

        Optional<String> option1 = Optional.of("Welcome to Java 9");
        Optional<String> option2 = Optional.ofNullable(null);


        option1.ifPresentOrElse(v -> {
            System.out.println("Option1 :  VALUE = " + v);
        }, () -> {
            System.out.println("Option1 : VALUE IS NOT PRESENT");
        });

        option2.ifPresentOrElse(v -> {
            System.out.println("Option2 : VALUE = " + v);
        }, () -> {
            System.out.println("Option2 : VALUE IS NOT PRESENT");
        });

        option2 = option2.or(() -> Optional.of("DEFAULT_VALUE"));

        String value = option2.get();

        System.out.println("Option2 : " + value);

        Stream<String> stream = option1.stream();

        stream.forEach(v->{
            System.out.println("STREAM VALUE : "+v);
        });
    }
}

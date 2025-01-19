package my.java9.features.collectionfactorymethods;

import java.util.Set;

public class SetFactoryMethod {

    public static void main(String[] args) {
        Set<String> set = Set.of("A","B","C","D");
//        Set<String> set = Set.of("A","B","C","D","A");

        System.out.println(set);
        set.add("X");
    }
}

package my.java9.features.intfpvtmethod;

public interface MyInterface {

    // Till Java 7
    String MSG = "HELLO WORLD";

    // Till Java 7
    String m1(String name);

    // Added In JAVA 8
    static String m2(String name) {
        String msg = m4(name);
        return name + ", Hello this is static method (m2) | "+msg;
    }

    // Added In JAVA 8
    default String m3(String name) {
        String msg = m4(name);
        return name + ", Hello this is default method (m3) | "+msg;

    }

    // Added In JAVA 9
    private static String m4(String name){
        return name + ", Hello this is private static method (m4)";
    }
}

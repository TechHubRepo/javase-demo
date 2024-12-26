package my.java9.features.intfpvtmethod;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger("MAIN");

    public static void main(String[] args) {
        String message = MyInterface.m2("Ram");
        LOG.info(message);

        MyInterface myInterface = name -> name + ", Hello this is implementation method (M1)";

        LOG.info(myInterface.m1("Niwash"));

    }
}
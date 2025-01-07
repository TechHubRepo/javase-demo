package my.java9.features.safevarargs;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Demo2 {
    private static final Logger LOG = Logger.getLogger(Demo2.class.getName());

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("A", "B");

        List<String> l2 = Arrays.asList("C", "D");

        m2(l1, l2);

    }

    @SafeVarargs
    public static void m2(List<String>... l){
        for(List<String> s: l){
            for(String s2: s){
                LOG.info(s2);
            }
        }
    }
}

package my.java9.features.safevarargs;

import my.java9.features.diamondoprenhece.IteratorDemo;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Demo1 {
    private static final Logger LOG = Logger.getLogger(Demo1.class.getName());

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("A", "B");

        List<String> l2 = Arrays.asList("C", "D");

        m1(l1, l2);
//        m2(l1, l2);

    }

    public static void m1(List<String>... l)//argument will become List<String>[]
    {

        Object[] a = l;// we can assign List[] to Object[]

        a[0] = Arrays.asList(10, 20);

        String name = (String) l[0].get(0);//String type pointing to Integer type

        LOG.info(name);
    }

    public static void m2(List<String>... l){
        for(List<String> s: l){
            for(String s2: s){
                LOG.info(s2);
            }
        }
    }
}

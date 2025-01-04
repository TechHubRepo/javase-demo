package my.java9.features.diamondoprenhece;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class IteratorDemo {

    private static final Logger LOG = Logger.getLogger(IteratorDemo.class.getName());

    public static void main(String[] args) {

        String[] name = {"Ram", "Shayam", "Shiv", "Krishan"};

        Iterator<String> myItr = new Iterator<String>() {

            int i = 0;

            @Override
            public boolean hasNext() {
                return i < name.length;
            }

            @Override
            public String next() {
                if(i== name.length){
                    throw new NoSuchElementException("No more element");
                }
               return name[i++];
            }
        };

        while(myItr.hasNext()){
            LOG.info(myItr.next());
        }
    }
}

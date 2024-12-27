package my.java9.features.tryresenhence;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Java1_9 {

    private static final Logger LOG = Logger.getLogger("Java1.9 Logger");

    public static void main(String[] args) {
        MyResource myResourceA = new MyResource("Java 1.9 Resource A");
        MyResource myResourceB = new MyResource("Java 1.9 Resource B");

        try (myResourceA; myResourceB) {
            String resNameA = myResourceA.getName();
            LOG.log(Level.INFO, resNameA);
            String resNameB = myResourceB.getName();
            LOG.log(Level.INFO, resNameB);
        } catch (MyResourceException exception) {
            LOG.log(Level.SEVERE, exception.getMessage(), exception);
        }
    }
}

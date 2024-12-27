package my.java9.features.tryresenhence;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Java1_7 {

    private static final Logger LOG = Logger.getLogger("Java1.7 Logger");

    public static void main(String[] args) {
        MyResource myResourceA = new MyResource("Java 1.7 Resource A");
        MyResource myResourceB = new MyResource("Java 1.7 Resource B");

        try(MyResource myResource1 = myResourceA; MyResource myResource2 = myResourceB){
            String resName1 = myResource1.getName();
            LOG.log(Level.INFO, resName1);
            String resName2 = myResource2.getName();
            LOG.log(Level.INFO, resName2);
        } catch (MyResourceException exception) {
            LOG.log(Level.SEVERE, exception.getMessage(), exception);
        }

//        try (MyResource myResource = new MyResource("Java 1.7 Resource")) {
//            String resName = myResource.getName();
//            LOG.log(Level.INFO, resName);
//        } catch (MyResourceException exception) {
//            LOG.log(Level.SEVERE, exception.getMessage(), exception);
//        }
    }
}

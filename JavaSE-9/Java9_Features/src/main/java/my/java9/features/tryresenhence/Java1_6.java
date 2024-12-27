package my.java9.features.tryresenhence;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Java1_6 {

    private static final Logger LOG = Logger.getLogger("Java1.6 Logger");

    public static void main(String[] args) {
        MyResource myResource = new MyResource("Java 1.6 Resource");
        try{
            String resName = myResource.getName();
            LOG.log(Level.INFO,resName);
        }catch (MyResourceException exception){
            LOG.log(Level.SEVERE, exception.getMessage(),exception);
        }finally {
            myResource.close();
        }
    }
}

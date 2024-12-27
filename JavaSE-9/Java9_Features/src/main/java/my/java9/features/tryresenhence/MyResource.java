package my.java9.features.tryresenhence;

import java.io.IOException;
import java.util.logging.Logger;

public class MyResource implements AutoCloseable {

    private static final Logger LOG = Logger.getLogger("MyResource Logger");

    private final String resourceName;

    public MyResource(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getName() throws MyResourceException {
        if(this.resourceName.isEmpty()){
            throw new MyResourceException("Resource name is empty");
        }
        return this.resourceName;
    }

    @Override
    public void close() {
        LOG.info(String.format("Closing Resource %s", this.resourceName));
    }
}

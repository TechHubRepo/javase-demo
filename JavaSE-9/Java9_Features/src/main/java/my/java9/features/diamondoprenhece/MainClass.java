package my.java9.features.diamondoprenhece;

import java.util.logging.Logger;

public class MainClass {

    private static final Logger LOG = Logger.getLogger("DIAMONDOPERENHENC");

    public static void main(String[] args) {
        MyStorage<String> myStorage1 = new MyStorage<>("Hello");
        String data = myStorage1.getData();
        LOG.info(data);
        LOG.info(myStorage1.toString());

        MyStorage<Integer> myStorage2 = new MyStorage<>(20){
            public Integer getData(){
                return super.getData();
            }

            @Override
            public String toString() {
                return "This is Anonymous Class";
            }
        };

        LOG.info("Data Anonymous Class = "+myStorage2.getData());
        LOG.info(myStorage2.toString());

    }
}

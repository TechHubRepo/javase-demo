package my.java9.features.processapi;

/**
 * Use Case-1: To get the process ID (PID) of current process
 * Try the following command the get the PID from Linux terminal
 * $ ps ax | grep Java-SE-Course
 *
 * @author Ram Niwash
 */
public class Lab1 {

    public static void main(String[] args) throws Exception {
        ProcessHandle p=ProcessHandle.current();

        long pid=p.pid();

        System.out.println("The PID of current running JVM instance :"+pid);

        Thread.sleep(100000);
    }
}

package my.java9.features.processapi;

/**
 * Use Case-2: To get snapshot of the current running process info
 *
 */
public class Lab2 {

    public static void main(String[] args) throws Exception {

        ProcessHandle p = ProcessHandle.current();

        ProcessHandle.Info info = p.info();

        System.out.println("Complete Process Inforamtion:\n" + info);

        System.out.println("User: " + info.user().get());

        System.out.println("Command: " + info.command().get());

        System.out.println("Start Time: " + info.startInstant().get());

        System.out.println("Total CPU Time Acquired: " + info.totalCpuDuration().get());
    }
}

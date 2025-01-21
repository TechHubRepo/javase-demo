package my.java9.features.processapi;

import java.util.Optional;

/**
 * Use Case-3: To get snapshot of the Particular Process Based on id
 * Get any process id.
 * $ ps ax
 */
public class Lab3 {


    public static void main(String[] args) throws Exception {

        Optional<ProcessHandle> opt = ProcessHandle.of(11699);

        ProcessHandle p = opt.get();

        ProcessHandle.Info info = p.info();

        System.out.println("Complete Process Inforamtion:\n" + info);

        System.out.println("User: " + info.user().get());

        System.out.println("Command: " + info.command().get());

        System.out.println("Start Time: " + info.startInstant().get());

        System.out.println("Total CPU Time Acquired: " + info.totalCpuDuration().get());
    }
}

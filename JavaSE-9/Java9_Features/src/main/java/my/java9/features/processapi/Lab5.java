package my.java9.features.processapi;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;

/**
 * Use Case-7: To display all running process information
 */
public class Lab5 {

    public static void main(String[] args) {
        Stream<ProcessHandle> processHandleStream = ProcessHandle.allProcesses();
        processHandleStream.limit(100).forEach(Lab5::dumpProcessInfo);
    }


    public static void dumpProcessInfo(ProcessHandle p) {
        ProcessHandle.Info info = p.info();
        System.out.println("Process Id:" + p.pid());
        System.out.println("User: " + info.user().orElse(""));
        System.out.println("Command: " + info.command().orElse(""));
        System.out.println("Start Time: " + info.startInstant().orElse(Instant.now()).toString());
        System.out.println("Total CPU Time Acquired: " + info.totalCpuDuration().
                orElse(Duration.ofMillis(0)).toMillis());
        System.out.println();
    }
}
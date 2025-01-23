package my.java9.features.processapi;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Use Case-8: To display all child process information
 * Get any process id.
 * $ ps ax | grep care
 */
public class Lab6 {

    public static void main(String[] args) {
//        ProcessHandle handle = ProcessHandle.current();
        Optional<ProcessHandle> optionalProcessHandle = ProcessHandle.of(3271);
        if(optionalProcessHandle.isPresent()) {
            ProcessHandle handle = optionalProcessHandle.get();
            Stream<ProcessHandle> processHandleStream = handle.children();
            processHandleStream.limit(100).forEach(Lab6::dumpProcessInfo);
        }
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
package my.java9.features.processapi;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * Use Case-9: To perform a task at the time of Process Termination
 */
public class Lab7 {

    public static void main(String[] args) throws Exception {

        ProcessBuilder pb = new ProcessBuilder("firefox", "https://www.youtube.com");

        Process p = pb.start();

        System.out.println("Firefox Started with id:" + p.pid());

        CompletableFuture<Process> future = p.onExit();

        future.thenAccept(p1 ->
                System.out.println("Firefox is terminating with process id = " + p1.pid())
        );

        System.out.println(future.get());
    }
}
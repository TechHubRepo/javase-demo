package my.java9.features.processapi;

/**
 * Use Case-6: To start and destroy a process from java by using ProcessBuilder
 */
public class Lab4Test2 {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting.....");
        ProcessBuilder pb = new ProcessBuilder("java", "Lab4");
        Process process = pb.start();
        System.out.println("Process Will be destroyed after 10 Sec");
        Thread.sleep(10000);
        process.destroy();
        System.out.println("END");
    }
}

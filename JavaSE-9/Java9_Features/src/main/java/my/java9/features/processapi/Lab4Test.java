package my.java9.features.processapi;

/**
 * Use Case-4: To create and Start a process by using ProcessBuilder
 */
public class Lab4Test {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting.....");
        ProcessBuilder pb = new ProcessBuilder("java", "Lab4");
        pb.start();
        System.out.println("END");
    }
}

package my.java9.features.processapi;

public class Lab4Test {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting.....");
        ProcessBuilder pb = new ProcessBuilder("java", "Lab4");
        pb.start();
        System.out.println("END");
    }
}

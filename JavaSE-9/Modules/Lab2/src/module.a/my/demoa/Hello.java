package my.demoa;

public class Hello{

    public Hello(){
        System.out.println("MODULE.A > Hello Default Constructor.");
    }

    public String getMessage(String name){
        System.out.println("MODULE.A > Hello says, Hello World, Welcome to JPMS Lab2");
        return name+", How are you?";
    }
}

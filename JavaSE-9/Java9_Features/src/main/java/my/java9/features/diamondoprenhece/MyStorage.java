package my.java9.features.diamondoprenhece;

public class MyStorage <T>{

    private final T data;

    public MyStorage(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    @Override
    public String toString() {
        return "This is MyStorage Class";
    }
}

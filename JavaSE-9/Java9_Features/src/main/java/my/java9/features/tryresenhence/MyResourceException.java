package my.java9.features.tryresenhence;

public class MyResourceException extends Exception{

    public MyResourceException(String message) {
        super(message);
    }

    public MyResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyResourceException(Throwable cause) {
        super(cause);
    }

    public MyResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

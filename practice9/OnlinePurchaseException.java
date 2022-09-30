package practice9;

public class OnlinePurchaseException extends RuntimeException{
    public OnlinePurchaseException(String errorMessage, Throwable e) { super(errorMessage, e); }
}

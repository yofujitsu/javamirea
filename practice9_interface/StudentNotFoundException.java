package practice9_interface;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

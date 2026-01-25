package by.alexeibut.ft.exception;

public class ArrayException extends Exception {

    public ArrayException(String message) {
        super(message);
    }

    public ArrayException(String message, Throwable cause) {
        super(message, cause);
    }
}
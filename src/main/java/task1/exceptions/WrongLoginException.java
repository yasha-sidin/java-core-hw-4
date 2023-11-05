package task1.exceptions;

public class WrongLoginException extends AccessException {
    public WrongLoginException() {

    }

    public WrongLoginException(String msg) {
        super(msg);
    }
}

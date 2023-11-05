package task1.exceptions;

public class WrongPasswordException extends AccessException {
    public WrongPasswordException() {

    }

    public WrongPasswordException(String msg) {
        super(msg);
    }
}

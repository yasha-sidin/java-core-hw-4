package task2.Exceptions;

public class NoProductException extends StoreException {
    public NoProductException() {

    }

    public NoProductException(String msg) {
        super(msg);
    }
}

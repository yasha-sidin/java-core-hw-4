package task2.Exceptions;

public class NegativeAmountException extends StoreException {
    public NegativeAmountException() {

    }

    public NegativeAmountException(String msg) {
        super(msg);
    }
}

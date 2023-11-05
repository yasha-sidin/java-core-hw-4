package task2.Exceptions;

public class NoConsumerException extends StoreException {
    public NoConsumerException() {

    }

    public NoConsumerException(String msg) {
        super(msg);
    }
}

package task2.Exceptions;

public class NotEnoughProduct extends StoreException {
    public NotEnoughProduct() {

    }

    public NotEnoughProduct(String msg) {
        super(msg);
    }
}

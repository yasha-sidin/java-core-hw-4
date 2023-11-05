package task2;

import task2.Exceptions.NegativeAmountException;
import task2.Exceptions.StoreException;

public class Order {
    private final Consumer buyer;
    private final Product product;
    private final int amount;
    private boolean status;
    private int id;
    private static int count = 0;

    public Order(Consumer buyer, Product product, int amount) throws StoreException {
        if(amount <= 0) throw new NegativeAmountException("Amount must be more than 0.");
        this.buyer = buyer;
        this.product = product;
        this.id = count;
        this.amount = amount;
        count++;
    }

    public Order(Consumer buyer, Product product, int amount, boolean status) throws StoreException {
        if(amount <= 0) throw new NegativeAmountException("Amount must be more than 0.");
        this.buyer = buyer;
        this.product = product;
        this.id = count;
        this.amount = amount;
        this.status = status;
        count++;
    }

    public Order(Order order) throws StoreException {
        this(order.getBuyer(), order.getProduct(), order.getAmount(), order.isStatus());
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public Consumer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void executed() {
        this.status = true;
    }
}

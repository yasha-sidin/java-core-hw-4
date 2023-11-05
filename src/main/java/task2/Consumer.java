package task2;

import task2.Exceptions.NegativeAmountException;
import task2.Exceptions.StoreException;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedList;

public class Consumer {
    private String firstname;
    private String lastname;
    private HashMap<Product, Integer> products;

    public Consumer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        products = new HashMap<>();
    }

    public void buy(Product product, int amount) throws StoreException {
        if(amount <= 0) throw new NegativeAmountException("Amount must be more than 0.");
        products.put(product, amount);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}

package task2;

import task2.Exceptions.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Store {
    private static LinkedList<Consumer> consumers = new LinkedList<>();
    private static HashMap<Product, Integer> products = new HashMap<>();
    private static LinkedList<Order> orders = new LinkedList<>();
    private static Order order;

    public static void welcomeConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public static void bayConsumer(Consumer consumer) {
        consumers.remove(consumer);
    }

    public static void addProducts(Product product, int amount) throws StoreException {
        if(amount <= 0) throw new NegativeAmountException("Amount must be more than 0.");
        products.put(product, amount);
    }

    public static void addProducts(HashMap<Product, Integer> product) {
        products.putAll(product);
    }

    private static void setOrder(Consumer buyer, Product product, int amount) throws StoreException {
        order = new Order(buyer, product, amount);
    }

    private static void executeOrder(Consumer buyer, Product product, int amount) throws StoreException {
        setOrder(buyer, product, amount);
        if(!consumers.contains(order.getBuyer())) throw new NoConsumerException("There isn't this consumer in buyers list");
        if(!products.containsKey(order.getProduct())) throw new NoProductException("There isn't this product in products list");
        if(products.get(order.getProduct()) < order.getAmount()) throw new NotEnoughProduct("Not enough product.");
        if(products.get(order.getProduct()) - order.getAmount() == 0) products.remove(order.getProduct());
        else products.put(order.getProduct(), products.get(order.getProduct()) - order.getAmount());
        buyer.buy(order.getProduct(), order.getAmount());
        System.out.println(order.getBuyer().getLastname() + " " + order.getBuyer().getFirstname() + " bought " +
                order.getAmount() + " points of " + order.getProduct().getName());

    }

    public static void buyProducts(Consumer buyer, Product product, int amount) throws StoreException {
        try {
            executeOrder(buyer, product, amount);
            order.executed();
            orders.add(new Order(order));
            bayConsumer(order.getBuyer());
        } catch (StoreException e) {
            System.out.println("StoreException: " + e.getMessage());
            orders.add(new Order(order));
        }
    }

    public static long getSells() {
        return orders.stream()
                .filter(Order::isStatus)
                .count();
    }
}

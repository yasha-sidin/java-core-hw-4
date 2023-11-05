package task2;

import task2.Exceptions.StoreException;

import java.util.HashMap;

public class App {
    public static void main(String[] args) throws StoreException {
        HashMap<Product, Integer> products = new HashMap<>();
        Product product1 = new Product("Cream", "Cream", 100);
        Product product2 = new Product("Cola", "Drink", 50);
        Product product3 = new Product("Banana", "Fruit", 70);
        Product product4 = new Product("Cofe", "Drink", 40);
        products.put(product1, 4);
        products.put(product2, 5);
        products.put(product3, 7);
        products.put(product4, 9);

        Store.addProducts(products);

        Consumer consumer1 = new Consumer("Fred", "Tomson");
        Consumer consumer2 = new Consumer("Bill", "Snow");
        Consumer consumer3 = new Consumer("John", "Snow");
        Store.welcomeConsumer(consumer1);
        Store.welcomeConsumer(consumer2);
        Store.welcomeConsumer(consumer3);

        Store.buyProducts(consumer1, product1, 4);
        Store.buyProducts(consumer2, product2, 10);
        Store.buyProducts(consumer1, product1, 1);
        Store.buyProducts(consumer3, product4, -1);
        Store.buyProducts(consumer3, product4, 8);

        System.out.println("Total sells: " + Store.getSells());
    }
}

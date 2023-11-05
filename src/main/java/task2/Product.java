package task2;

public class Product {
    private String name;

    private String type;
    private double cost;

    public Product(String name, String type, double cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }
}

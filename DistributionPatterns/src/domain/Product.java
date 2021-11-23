package domain;

public class Product {
    private String name;
    private double price;

    public Product(String nm, double pr) {
        name = nm;
        price = pr;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        price = pr;
    }
    // business logic goes here
}

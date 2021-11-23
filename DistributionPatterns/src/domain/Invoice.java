package domain;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Product> cart;
    private static final double SALES_TAX = .07;

    public Invoice(Customer c) {
        customer = c;
        cart = new ArrayList<Product>();
    }

    public void add(Product p) {
        cart.add(p);
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getCart() {
        return cart;
    }

    public double total() {
        double result = 0;
        for (Product p : cart) {
            result += p.getPrice();
        }
        result *= SALES_TAX;
        return result;
    }
    // more business logic goes here
}

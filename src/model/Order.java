package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    static List<Product> orderedProducts = new ArrayList<>();
    public static List<Order> allOrders = new ArrayList<>();
    public static int globalOrderNumber = 1;

    int number;
    double cost;
    List<Product> finalProducts;

    public Order(int number, double cost, List<Product> finalProducts) {
        this.number = number;
        this.cost = cost;
        this.finalProducts = finalProducts;
    }

    public static void addProduct(Product product){
        orderedProducts.add(product);
    }

    public static void removeProduct(Product product){
        orderedProducts.remove(product);
    }

    public static List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public static void clearCart() {
        orderedProducts.clear();
    }

    public static void removeOrder(Order order) {
        allOrders.remove(order);
    }

    public int getNumber() {
        return number;
    }

    public double getCost() {
        return cost;
    }

    public List<Product> getFinalProducts() {
        return finalProducts;
    }
}
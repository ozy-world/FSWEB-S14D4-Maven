package org.example.model;

public class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        System.out.println(type + " : " + quantity + " qty @ " + String.format("%.2f", price) + " = " + String.format("%.2f", getSalesPrice(quantity)));
    }

    public void showDetails() {
        System.out.println("This is a " + type + " - " + description);
    }
}

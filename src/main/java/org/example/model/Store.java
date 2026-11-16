package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
            new Bread("Bread", 1.5, "Fresh bread"),
            new Chocolate("Chocolate", 2.0, "Milk chocolate"),
            new Coke("Coke", 1.0, "Cold coke")
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            product.printPricedItem(2);
        }
    }
}

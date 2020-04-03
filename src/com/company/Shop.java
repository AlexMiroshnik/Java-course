package com.company;

public class Shop {
    public static void main(String[] args) {
        Product product = new Product("Milka", 30, 100);
        Product product1 = new Product("Ritter", 45, 50);
        Product product2 = new Product("Bounty", 20, 200);

        Product expensiveProduct = null;

        if (product.getPrice() > product1.getPrice() && product.getPrice() > product2.getPrice()) {
            expensiveProduct = product;
        } else if (product1.getPrice() > product.getPrice() && product1.getPrice() > product2.getPrice()) {
            expensiveProduct = product1;
        } else if (product2.getPrice() > product.getPrice() && product2.getPrice() > product1.getPrice()) {
            expensiveProduct = product2;
        }
        if (expensiveProduct != null) {
            System.out.println("Expensive product" + expensiveProduct.getName() + " " + expensiveProduct.getQuantity());
        } else {
            System.out.println("All products have the same price");
        }

        Product biggestQuantity = null;

        if (product.getQuantity() > product1.getQuantity() && product.getQuantity() > product2.getQuantity()) {
            biggestQuantity = product;
        } else if (product1.getQuantity() > product.getQuantity() && product1.getQuantity() > product2.getQuantity()) {
            biggestQuantity = product1;
        } else if (product2.getQuantity() > product.getQuantity() && product2.getQuantity() > product1.getQuantity()) {
            biggestQuantity = product2;
        }
        if (biggestQuantity != null) {
            System.out.println("Biggest quantity" + biggestQuantity.getName() + " " + biggestQuantity.getPrice());
        } else {
            System.out.println("All products have the same quantity");

        }
    }
}
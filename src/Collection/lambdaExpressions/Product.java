package Collection.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class Product {
    String name;
    int price;
    int quantity;
    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
 class ItemSorting {
     public static void main(String[] args) {
         ArrayList<Product> products = new ArrayList<>();
         products.add(new Product("Mobile", 20000, 10));
         products.add(new Product("Earphones", 10000, 19));
         products.add(new Product("Charger", 1000, 50));
         for (Product p : products) {
             System.out.println(p.name + " , " + p.price + " , " + p.quantity);
         }
         Collections.sort(products,(Product p1, Product p2) -> p2.price - p1.quantity);
         for(Product p : products){
             System.out.println(p.name + " , " + p.price + " , " + p.quantity);
         }

     }}

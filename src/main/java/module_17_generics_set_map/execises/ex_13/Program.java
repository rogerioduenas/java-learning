package module_17_generics_set_map.execises.ex_13;

import module_17_generics_set_map.execises.ex_13.model.Product;

import java.util.*;

public class Program {
  public static void main(String[] args) {
    Set<Product> products = new TreeSet<>();
    products.add(new Product("Tv", 500.0));
    products.add(new Product("Laptop", 1200.0));
    products.add(new Product("Tablet", 300.0));
    products.add(new Product("Tv", 500.0));
    products.add(new Product("Laptop", 1200.0));
    products.add(new Product("Mouse", 50.0));
    products.add(new Product("Tv", 500.0));
    products.add(new Product("Keyboard", 100.0));
    products.add(new Product("Tablet", 300.0));
    products.add(new Product("Monitor", 800.0));

    for (Product p : products) {
      System.out.println(p);
    }
  }
}

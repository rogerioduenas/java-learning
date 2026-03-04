package module17.execises.ex_15;

import module17.execises.ex_15.model.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
  public static void main(String[] args) {

    Map<Product, String> stock = new HashMap<>();
    stock.put(new Product("p1", 100.0), "Value p1");
    stock.put(new Product("p2", 200.0), "Value p2");

    Product p3 = new Product("p1", 100.0);

    System.out.println(stock.get(p3));
  }
}

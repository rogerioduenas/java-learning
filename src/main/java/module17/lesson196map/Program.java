package module17.lesson196map;

import module17.lesson196map.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
  public static void main(String[] args) {

    Map<String, String> cookies = new TreeMap<>();
    cookies.put("key2", "value2");
    cookies.put("key3", "value3");
    cookies.put("key1", "value1");

    for (String key : cookies.keySet()) {
      System.out.println(key + " : " + cookies.get(key));
    }

    System.out.println("---------------Objects---------------");

    Map<Product, Double> stock = new HashMap<>();

    stock.put(new Product("Tv", 900.0), 10000.0);
    stock.put(new Product("Notebook", 1200.0), 20000.0);
    stock.put(new Product("Tablet", 400.0), 15000.0);

    Product ps = new Product("Tv", 900.0);

    System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
  }
}

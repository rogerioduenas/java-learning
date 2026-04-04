package module_18_functional_programming_and_lambda_expressions.lesson_204_consumer.application;


import module_18_functional_programming_and_lambda_expressions.lesson_204_consumer.entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product("Tv", 900.00),
        new Product("Mouse", 50.00),
        new Product("Tablet", 350.00),
        new Product("HD Case", 80.00)));


//    Option 1 (implements interface)
//    products.forEach(new PriceUpdate());

//    Option 2 (with static method)
//    products.forEach(Product::staticPriceUpdate);

//    Option 3 (no static method)
//    products.forEach(Product::nonStaticPriceUpdate);

//    Option 4 (Declared lambda expression)
//    Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.05);
//    products.forEach(cons);

//    Option 5 (lambda inline)
    products.forEach(p -> p.setPrice(p.getPrice() * 1.15));

    products.forEach(System.out::println);
  }
}

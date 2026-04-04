package module_18_functional_programming_and_lambda_expressions.lesson_203_predicate.application;


import module_18_functional_programming_and_lambda_expressions.lesson_203_predicate.entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product("Tv", 900.00),
        new Product("Mouse", 50.00),
        new Product("Tablet", 350.50),
        new Product("HD Case", 80.90)));

//     Option 1 (implements interface)
//     products.removeIf(new ProductPredicate());

//    Option 2 (with static method)
//    products.removeIf(Product::staticProductPredicate);

//    Option 3 (no static method)
//    products.removeIf(Product::nonStaticProductPredicate);

//    Option 4 (Declared lambda expression)
//    Predicate<Product> predicate = p -> p.getPrice() >= 100.0;
//    products.removeIf(predicate);

//    Option 5 (lambda inline)
    products.removeIf(p -> p.getPrice() >= 100.0);

    for (Product p : products) {
      System.out.println(p);
    }
  }
}

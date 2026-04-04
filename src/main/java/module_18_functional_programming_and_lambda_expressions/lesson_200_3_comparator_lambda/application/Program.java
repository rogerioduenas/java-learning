package module_18_functional_programming_and_lambda_expressions.lesson_200_3_comparator_lambda.application;


import module_18_functional_programming_and_lambda_expressions.lesson_200_3_comparator_lambda.entities.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Product> products = Arrays.asList(
        new Product("TV", 900.00),
        new Product("Notebook", 1200.00),
        new Product("Tablet", 450.00));

    // Option 1
    Comparator<Product> comparator1 = (p1, p2) -> {
      return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    };

    // Option 2
    Comparator<Product> comparator2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

    // Option 3
    products.sort(comparator2);

    // Option 4
    products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

    // Option 5
    products.sort(Comparator.comparing(p -> p.getName().toUpperCase()));


    for (Product p : products) {
      System.out.println(p);
    }
  }
}

package module_18_functional_programming_and_lambda_expressions.lesson_200_2_comparator_anonymous_class.application;


import module_18_functional_programming_and_lambda_expressions.lesson_200_2_comparator_anonymous_class.entities.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Product> products = Arrays.asList(
        new Product("TV", 900.00),
        new Product("Notebook", 1200.00),
        new Product("Tablet", 450.00));

    Comparator<Product> comparator = new Comparator<>() {
      @Override
      public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
      }
    };

    products.sort(comparator);

    for(Product p : products) {
      System.out.println(p);
    }
  }
}

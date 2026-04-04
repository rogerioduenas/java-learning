package module_18_functional_programming_and_lambda_expressions.lesson_200_1_comparator_separate_class.application;


import module_18_functional_programming_and_lambda_expressions.lesson_200_1_comparator_separate_class.entities.Product;
import module_18_functional_programming_and_lambda_expressions.lesson_200_1_comparator_separate_class.util.MyComparator;

import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Product> products = Arrays.asList(
        new Product("TV", 900.00),
        new Product("Notebook", 1200.00),
        new Product("Tablet", 450.00));

    products.sort(new MyComparator());

    for(Product p : products) {
      System.out.println(p);
    }
  }
}

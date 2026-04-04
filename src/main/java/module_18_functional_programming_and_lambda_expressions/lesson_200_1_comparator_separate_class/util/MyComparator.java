package module_18_functional_programming_and_lambda_expressions.lesson_200_1_comparator_separate_class.util;

import module_18_functional_programming_and_lambda_expressions.lesson_200_1_comparator_separate_class.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

  @Override
  public int compare(Product p1, Product p2) {
    return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
  }
}

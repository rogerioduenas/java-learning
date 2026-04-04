package module_18_functional_programming_and_lambda_expressions.lesson_206_functions_as_arguments.service;

import module_18_functional_programming_and_lambda_expressions.lesson_206_functions_as_arguments.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

  public static double filteredSum(List<Product> products, Predicate<Product> criteria) {
    double sum = 0.0;
    for (Product product : products) {
      if (criteria.test(product)) {
        sum += product.getPrice();
      }
    }
    return sum;
  }
}

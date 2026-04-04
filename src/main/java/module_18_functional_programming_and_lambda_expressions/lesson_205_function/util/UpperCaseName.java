package module_18_functional_programming_and_lambda_expressions.lesson_205_function.util;

import module_18_functional_programming_and_lambda_expressions.lesson_205_function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
  @Override
  public String apply(Product product) {
    return product.getName().toUpperCase();
  }
}

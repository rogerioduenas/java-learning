package module_18_functional_programming_and_lambda_expressions.lesson_203_predicate.util;

import module_18_functional_programming_and_lambda_expressions.lesson_203_predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
  @Override
  public boolean test(Product p) {
    return p.getPrice() >= 100;
  }
}

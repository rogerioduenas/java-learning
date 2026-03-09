package module18.lesson205function.util;

import module18.lesson205function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
  @Override
  public String apply(Product product) {
    return product.getName().toUpperCase();
  }
}

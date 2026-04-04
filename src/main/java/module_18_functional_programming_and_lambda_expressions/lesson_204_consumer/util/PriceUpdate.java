package module_18_functional_programming_and_lambda_expressions.lesson_204_consumer.util;

import module_18_functional_programming_and_lambda_expressions.lesson_204_consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

  @Override
  public void accept(Product product) {
    product.setPrice(product.getPrice() * 1.10);
  }
}

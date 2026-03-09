package module18.lesson204consumer.util;

import module18.lesson204consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

  @Override
  public void accept(Product product) {
    product.setPrice(product.getPrice() * 1.10);
  }
}

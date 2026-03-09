package module18.lesson203predicate.util;

import module18.lesson203predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
  @Override
  public boolean test(Product p) {
    return p.getPrice() >= 100;
  }
}

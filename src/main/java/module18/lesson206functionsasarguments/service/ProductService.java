package module18.lesson206functionsasarguments.service;

import module18.lesson206functionsasarguments.entities.Product;

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

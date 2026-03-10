package module18.lesson206functionsasarguments.application;


import module18.lesson206functionsasarguments.entities.Product;
import module18.lesson206functionsasarguments.service.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program {
  public static void main(String[] args) {

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product("Tv", 900.00),
        new Product("Mouse", 50.00),
        new Product("Tablet", 350.00),
        new Product("HD Case", 80.00))
    );

    Predicate<Product> criteria = product -> product.getName().charAt(0) == 'M';
    System.out.println(ProductService.filteredSum(products, criteria));
  }
}

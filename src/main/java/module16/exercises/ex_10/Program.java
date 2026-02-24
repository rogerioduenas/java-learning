package module16.exercises.ex_10;

import module16.exercises.ex_10.model.Product;
import module16.exercises.ex_10.services.ProductService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Program {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("src/main/java/module16/exercises/ex_10/products.csv");
    ProductService productService = new ProductService();
    List<Product> products = productService.getProducts(path);
    Collections.sort(products);

    for (Product product : products) {
      System.out.println(product);
    }
  }
}

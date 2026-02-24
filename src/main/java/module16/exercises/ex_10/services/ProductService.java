package module16.exercises.ex_10.services;

import module16.exercises.ex_10.model.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

  public List<Product> getProducts(Path path) throws IOException {
    List<String> lines = Files.readAllLines(path);
    List<Product> products = new ArrayList<>();

    for (int i = 1; i < lines.size(); i++) {
      String[] line = lines.get(i).split(",");
      String name = line[0];
      double price = Double.parseDouble(line[1]);
      int quantitySold = Integer.parseInt(line[2]);
      products.add(new Product(name, price, quantitySold));
    }
    return products;
  }
}

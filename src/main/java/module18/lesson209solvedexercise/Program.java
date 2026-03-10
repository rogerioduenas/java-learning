package module18.lesson209solvedexercise;

import module18.lesson209solvedexercise.entities.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
  public static void main(String[] args) throws IOException {

    Path path = Path.of("src/main/java/module18/lesson209solvedexercise/products.csv");
    List<String> lines = Files.readAllLines(path);
    List<Product> products = new ArrayList<>();

    for (String line : lines) {
      String[] fields = line.split(",");
      Product product = new Product(fields[0], Double.parseDouble(fields[1]));
      products.add(product);
    }

    double average = products.stream()
        .map(Product::getPrice)
        .reduce(0.0, Double::sum) / products.size();

    Comparator<String> comp = Comparator.comparing(String::toUpperCase);

    List<String> listProducts = products.stream()
        .filter(p -> p.getPrice() < average)
        .map(Product::getName).sorted(comp.reversed())
        .toList();

    System.out.printf("Average price: %.2f%n", average);
    listProducts.forEach(System.out::println);
  }
}

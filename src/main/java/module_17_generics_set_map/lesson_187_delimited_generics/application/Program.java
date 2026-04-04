package module_17_generics_set_map.lesson_187_delimited_generics.application;

import module_17_generics_set_map.lesson_187_delimited_generics.entities.Product;
import module_17_generics_set_map.lesson_187_delimited_generics.services.CalculationService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Program {

  public static void main(String[] args) throws IOException {

    List<Product> list = new ArrayList<>();

    Path path = Path.of("src/main/java/module17/lesson187delimitedgenerics/products.csv");
    List<String> lines = Files.readAllLines(path);

    for (String line : lines) {
      String[] fields = line.split(",");
      list.add(new Product(fields[0], Double.parseDouble(fields[1])));
    }

    Product mostExpensive = CalculationService.max(list);
    System.out.println("Most expensive:");
    System.out.println(mostExpensive);

    System.out.printf("---First Item of list---%n%s", CalculationService.first(list));
  }
}



package module13.exercises.ex_4.application;

import module13.exercises.ex_4.entities.ImportedProduct;
import module13.exercises.ex_4.entities.Product;

public class Program {
  public static void main(String[] args) {

    System.out.println("--- National ---");
    Product product = new Product("TV", 2000.0);
    System.out.println(product.priceTag());

    System.out.println("--- Imported ---");
    Product imported = new ImportedProduct("Radio", 1000.0, 100.0);
    System.out.println(imported.priceTag());

  }
}

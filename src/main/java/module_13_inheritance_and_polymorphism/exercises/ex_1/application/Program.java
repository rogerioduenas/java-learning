package module_13_inheritance_and_polymorphism.exercises.ex_1.application;

import module_13_inheritance_and_polymorphism.exercises.ex_1.entities.Product;

public class Program {
  public static void main(String[] args) {
    Product product = new Product("bread", 10.0);
    product.updatePrice(5.0);
    System.out.println(product);
  }
}

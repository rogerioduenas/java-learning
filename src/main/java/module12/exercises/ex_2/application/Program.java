package module12.exercises.ex_2.application;

import module12.exercises.ex_2.entities.Product;
import module12.exercises.ex_2.entities.ProductCategory;

public class Program {
  public static void main(String[] args) {

    Product car = Product.createProduct(111, "Ferrari", 25000.0, ProductCategory.PREMIUM);
    System.out.println(car);
  }
}

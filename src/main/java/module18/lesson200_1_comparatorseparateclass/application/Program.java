package module18.lesson200_1_comparatorseparateclass.application;


import module18.lesson200_1_comparatorseparateclass.entities.Product;
import module18.lesson200_1_comparatorseparateclass.util.MyComparator;

import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Product> products = Arrays.asList(
        new Product("TV", 900.00),
        new Product("Notebook", 1200.00),
        new Product("Tablet", 450.00));

    products.sort(new MyComparator());

    for(Product p : products) {
      System.out.println(p);
    }
  }
}

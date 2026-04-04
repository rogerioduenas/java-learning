package module_17_generics_set_map.lesson_193_comparing_elements_with_treeset;

import module_17_generics_set_map.lesson_193_comparing_elements_with_treeset.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Program {
  public static void main(String[] args) {

    Set<Product> set = new TreeSet<>();

    set.add(new Product("Tv", 900.0));
    set.add(new Product("Notebook", 1200.0));
    set.add(new Product("Tablet", 400.0));

    for (Product p : set) {
      System.out.println(p);
    }
  }
}

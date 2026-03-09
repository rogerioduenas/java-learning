package module18.lesson205function.application;


import module18.lesson205function.entities.Product;
import module18.lesson205function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product("Tv", 900.00),
        new Product("Mouse", 50.00),
        new Product("Tablet", 350.00),
        new Product("HD Case", 80.00)));


//    Option 1 (implements interface)
//    List<String> listNames = products.stream().map(new UpperCaseName()).collect(Collectors.toList());
//    List<String> listNames = products.stream().map(new UpperCaseName()).toList();
//    products.stream().map(new UpperCaseName()).forEach(System.out::println);


//    Option 2 (with static method)
//    products.stream().map(Product::staticUpperCase).forEach(System.out::println);

//    Option 3 (no static method)
//    products.stream().map(Product::nonStaticUpperCase).forEach(System.out::println);

//    Option 4 (Declared lambda expression)
//    Function<Product, String> func = p -> p.getName().toUpperCase();
//    products.stream().map(func).forEach(System.out::println);

//    Option 5 (lambda inline)
    products.stream().map(p -> p.getName().toUpperCase()).forEach(System.out::println);
  }
}

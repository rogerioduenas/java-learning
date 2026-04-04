package module_18_functional_programming_and_lambda_expressions.lesson_205_function.application;


import module_18_functional_programming_and_lambda_expressions.lesson_205_function.entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

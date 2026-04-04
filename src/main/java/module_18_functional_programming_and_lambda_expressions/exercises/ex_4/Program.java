package module_18_functional_programming_and_lambda_expressions.exercises.ex_4;

import module_18_functional_programming_and_lambda_expressions.exercises.ex_4.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Program {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product("Laptop", 4500.00, 15),
        new Product("Mouse", 120.50, 50),
        new Product("Keyboard", 350.00, 8)
    ));

    Function<Product, String> func = p -> p.getName().toUpperCase();
    products.stream().map(func).forEach(System.out::println);
  }
}

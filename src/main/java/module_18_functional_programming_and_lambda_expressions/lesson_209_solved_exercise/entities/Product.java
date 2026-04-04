package module_18_functional_programming_and_lambda_expressions.lesson_209_solved_exercise.entities;

public class Product {

  private final String name;
  private final double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}

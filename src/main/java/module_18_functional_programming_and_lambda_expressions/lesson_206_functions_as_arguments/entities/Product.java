package module_18_functional_programming_and_lambda_expressions.lesson_206_functions_as_arguments.entities;

public class Product {

  private String name;
  private Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return String.format("name: %s, price: %.2f", name, price);
  }
}

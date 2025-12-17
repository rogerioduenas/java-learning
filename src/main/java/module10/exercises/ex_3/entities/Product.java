package module10.exercises.ex_3.entities;

public class Product {
  private final String name;
  private final Double price;
  private final Integer quantity;

  public Product(String name, Double price, Integer quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  public String getName() {
    return name;
  }

  public String toString() {
    return String.format("Name: %s - Price: $%s - Quantity: %s", name, price, quantity);
  }
}

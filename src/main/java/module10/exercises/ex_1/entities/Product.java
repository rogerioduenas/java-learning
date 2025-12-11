package module10.exercises.ex_1.entities;

public class Product {
  private String name;
  private Double price;
  private Integer quantity;

  public Product(String name, Double price, Integer quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public double totalValue() {
    return this.price * this.quantity;
  }

  public String toString() {
    return String.format("Name: %s, Price: %.2f, Quantity: %d Total value: %.2f", name, price, quantity, totalValue());
  }

}

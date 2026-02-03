package module14.exercises.ex_1.entities;

public class OrderItem {
  private String name;
  private int quantity;
  private double price;

  public OrderItem(String name, int quantity, double price) {
    validateItem(quantity, price);
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public double getTotal() {
    return this.price * this.quantity;
  }

  private void validateItem(int quantity, double price) {
    if (quantity <= 0) {
      throw new IllegalArgumentException("Quantity must be greater than zero.");
    }
    if (price < 0) {
      throw new IllegalArgumentException("Price must be positive.");
    }
  }

  @Override
  public String toString() {
    return String.format("%s, $%.2f x %d. Subtotal: $%.2f",
        name, price, quantity, getTotal());
  }
}

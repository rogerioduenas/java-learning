package module09.exercises.ex_9.entities;

public class InventoryItem {
  private String name;
  private double unitPrice;
  private int quantity;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }
    this.name = name;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    if (unitPrice < 0) {
      throw new IllegalArgumentException("Unit price cannot be negative");
    }
    this.unitPrice = unitPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    if (quantity < 0) {
      throw new IllegalArgumentException("Quantity cannot be negative");
    }
    this.quantity = quantity;
  }

  public void increase(int quantity) {
    if (quantity < 0) {
      throw new IllegalArgumentException("Increase amount cannot be negative");
    }
    this.quantity += quantity;
  }

  public void decrease(int quantity) {
    if (quantity < 0) {
      throw new IllegalArgumentException("Decrease amount cannot be negative");
    }
    if (this.quantity - quantity < 0) {
      throw new IllegalArgumentException("Quantity cannot go below zero");
    }
    this.quantity -= quantity;
  }

  public double getTotalValue() {
    return this.quantity * this.unitPrice;
  }

  public String toString() {
    return String.format(
        "Name: %s%nUnit price: %.2f%nQuantity: %d%nTotal Value in stock: %.2f%n",
        name, unitPrice, quantity, getTotalValue()
    );
  }
}


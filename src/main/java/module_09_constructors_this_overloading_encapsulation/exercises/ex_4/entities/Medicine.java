package module_09_constructors_this_overloading_encapsulation.exercises.ex_4.entities;

public class Medicine {
  private String name;
  private double price;
  private int quantity;

  public Medicine(String name, int quantity) {
    setName(name);
    setInitialQuantity(quantity);
    this.price = 0.0;
  }

  public Medicine() {
    this.name = "Ibuprofen";
    this.price = 0.0;
    this.quantity = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Medicine name cannot be null or blank");
    }
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException("Price cannot be negative");
    }
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void addStock(int quantity) {
    if (quantity <= 0) {
      throw new IllegalArgumentException("Quantity to add must be greater than zero");
    }
    this.quantity += quantity;
  }

  public void removeStock(int quantity) {
    if (quantity <= 0) {
      throw new IllegalArgumentException("Quantity to remove must be greater than zero");
    }
    if (quantity > this.quantity) {
      throw new IllegalArgumentException(
          String.format("Insufficient stock. Current stock: %d, requested: %d", this.quantity, quantity)
      );
    }
    this.quantity -= quantity;
  }

  private void setInitialQuantity(int quantity) {
    if (quantity < 0) {
      throw new IllegalArgumentException("Initial quantity cannot be negative");
    }
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return String.format("Name: %s - Price: %.2f - Quantity: %d%n", this.name, this.price, this.quantity);
  }
}
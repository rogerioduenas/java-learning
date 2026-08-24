package module_09_constructors_this_overloading_encapsulation.exercises.ex_1.entities;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Product name cannot be null");
    }
    if (price < 0) {
      throw new IllegalArgumentException("Product price cannot be negative");
    }
    if (quantity < 0) {
      throw new IllegalArgumentException("Product quantity cannot be negative");
    }
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Product(String name, double price) {
    this(name, price, 0);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void addProducts(int quantity) {
    if (quantity <= 0){
      throw new IllegalArgumentException("Product quantity must be greater than 0");
    }
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    if (quantity <= 0){
      throw new IllegalArgumentException("Product quantity must be greater than 0");
    }

    if (quantity > this.quantity){
      throw new IllegalArgumentException("Product quantity must be less than quantity");
    }
    this.quantity -= quantity;
  }

  public double getTotalValueInStock() {
    return price * quantity;
  }

  public String toString() {
    return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", getTotalValueInStock());
  }
}

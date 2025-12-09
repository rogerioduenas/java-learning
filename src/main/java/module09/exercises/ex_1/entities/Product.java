package module09.exercises.ex_1.entities;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
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
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    if (quantity > this.quantity) {
      System.out.printf("It was not possible to remove the quantity of products from stock because the quantity is greater than the available stock, which is %d items.", this.quantity);
      return;
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

package module08.lesson67oopexample.entities;

public class Product {

  public String name;
  public double price;
  public int quantity;

  public double totalValueInStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public String toString() {
    String result = String.format("Product: %s\n - Price: %.2f\n - Quantity: %d\n - Total: %.2f\n", name, price, quantity, totalValueInStock());
    return result;
  }
}

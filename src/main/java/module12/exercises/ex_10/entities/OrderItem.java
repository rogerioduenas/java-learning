package module12.exercises.ex_10.entities;

public class OrderItem {
  private int quantity;
  private Product product;

  public OrderItem(int quantity, Product product) {
    this.quantity = quantity;
    this.product = product;
  }

  public double getTotal() {
    return product.getPrice() * quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public Product getProduct() {
    return product;
  }
}

package module12.exercises.ex_7.entities;

public class OrderItem {
  private int quantity;
  private Product product;

  public OrderItem(int quantity, Product product) {
    this.quantity = quantity;
    this.product = product;
  }

  public double getSubTotal() {
    return quantity * product.getPrice();
  }

  @Override
  public String toString() {
    return "OrderItem{" +
        "quantity=" + quantity +
        ", product=" + product +
        '}';
  }
}

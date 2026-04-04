package module_12_enumeration_and_composition.exercises.ex_8.entities;

public class OrderItem {
  private int quantity;
  private Product product;

  public OrderItem(int quantity, Product product) {
    this.quantity = quantity;
    this.product = product;
  }

  public int getQuantity() {
    return quantity;
  }

  public Product getProduct() {
    return product;
  }

  public double getTotal() {
    return product.getPrice() * quantity;
  }
}

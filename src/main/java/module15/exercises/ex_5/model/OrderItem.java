package module15.exercises.ex_5.model;

public class OrderItem {

  private final String productName;
  private final double unitPrice;
  private final int quantity;

  public OrderItem(String productName, double unitPrice, int quantity) {
    this.productName = productName;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  public double getTotalPrice() {
    return unitPrice * quantity;
  }

  @Override
  public String toString() {
    return String.format("%s: %.2f - %d", productName, unitPrice, quantity);
  }
}

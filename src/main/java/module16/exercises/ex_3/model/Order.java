package module16.exercises.ex_3.model;

public class Order {

  private String orderId;
  private final double amount;
  private double totalAmount;

  public Order(String orderId, double amount) {
    this.orderId = orderId;
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public void setTotalAmount(double amount) {
    this.totalAmount = amount;
  }

  @Override
  public String toString() {
    return String.format("Id: %s - Amount: $%.2f - Total: $%.2f", orderId, amount, totalAmount);
  }
}

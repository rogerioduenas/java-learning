package module14.exercises.ex_4.entities;

public class Stock {

  private final String productName;
  private int quantityAvailable;

  public Stock(String productName, int quantityAvailable) {
    validateConstructor(quantityAvailable);
    this.productName = productName;
    this.quantityAvailable = quantityAvailable;
  }

  public void withdraw(int amount) {
    validateWithdraw(amount);
    quantityAvailable -= amount;
  }

  private void validateWithdraw(int amount) {
    if (this.quantityAvailable < amount) {
      throw new IllegalArgumentException("Amount is greater than quantity available");
    }
    if (amount < 0) {
      throw new IllegalArgumentException("Amount cannot be negative");
    }
  }

  private static void validateConstructor(int quantityAvailable) {
    if (quantityAvailable < 0) {
      throw new IllegalArgumentException("Quantity cannot be negative");
    }
  }

  @Override
  public String toString() {
    return String.format("Product: %s - Quantity Available: %d%n", productName, quantityAvailable);
  }
}

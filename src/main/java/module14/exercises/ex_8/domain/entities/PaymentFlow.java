package module14.exercises.ex_8.domain.entities;

import module14.exercises.ex_8.domain.exceptions.DomainException;

public class PaymentFlow {
  private final double orderAmount;
  private final double taxAmount;
  private double finalAmount;

  public PaymentFlow(double orderAmount) {
    if (orderAmount <= 0) {
      throw new DomainException("Order amount must be grater than 0.");
    }
    this.orderAmount = orderAmount;
    this.taxAmount = orderAmount * 0.1;
  }

  public void execute() {
    finalAmount = calculateTaxes();
    chargePayment();
    System.out.printf("Payment of $%.2f confirmed!%n", finalAmount);
  }

  private double calculateTaxes() {
    return orderAmount + this.taxAmount;
  }

  private void chargePayment() {
    if (finalAmount > 1400.0) {
      throw new DomainException("Transaction denied: limit exceeded.");
    }

    if (Math.random() > 0.7) {
      throw new DomainException("Payment Gateway is offline. Try again later.");
    }

    System.out.println("Processing with bank...");
  }
}

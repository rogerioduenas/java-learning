package module14.exercises.ex_3.entities;

public class InstallmentPayment {

  private double totalAmount;
  private int numberOfInstallments;

  public InstallmentPayment(double totalAmount, int numberOfInstallments) {
    validate(totalAmount, numberOfInstallments);
    this.totalAmount = totalAmount;
    this.numberOfInstallments = numberOfInstallments;
  }

  public double calculateInstallmentValue() {
    return this.totalAmount / this.numberOfInstallments;
  }

  private static void validate(double totalAmount, int numberOfInstallments) {
    if (totalAmount <= 0) {
      throw new IllegalArgumentException("Amount must be greater than zero to perform division.");
    }
    if (numberOfInstallments <= 0) {
      throw new IllegalArgumentException("Number of Installments must be greater than 0");
    }
  }

  @Override
  public String toString() {
    return String.format("Total $%.2f divided into: %d x $%.2f", totalAmount, numberOfInstallments, calculateInstallmentValue());
  }
}

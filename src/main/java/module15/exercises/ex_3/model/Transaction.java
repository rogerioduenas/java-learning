package module15.exercises.ex_3.model;

public class Transaction {

  private String description;
  private final double amount;

  public Transaction(String description, double amount) {
    this.description = description;
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }
}

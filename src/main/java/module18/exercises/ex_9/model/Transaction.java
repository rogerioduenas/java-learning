package module18.exercises.ex_9.model;

public class Transaction {

  private String id;
  private Double amount;

  public Transaction(String id, Double amount) {
    this.id = id;
    this.amount = amount;
  }

  public Double getAmount() {
    return amount;
  }
}

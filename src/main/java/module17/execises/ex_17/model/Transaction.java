package module17.execises.ex_17.model;

import java.util.Objects;

public class Transaction {

  private String transactionId;
  private Double amount;

  public Transaction(String transactionId, Double amount) {
    this.transactionId = transactionId;
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Transaction that = (Transaction) o;
    return Objects.equals(transactionId, that.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(transactionId);
  }

  @Override
  public String toString() {
    return String.format("transactionId: %s, amount: %.2f", transactionId, amount);
  }
}

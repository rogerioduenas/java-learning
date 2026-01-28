package module13.exercises.ex_3.entities;

public class Account {
  private int number;
  private String holder;
  private Double balance;

  public Account(int number, String holder, Double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }

  protected Double withdrawFee(Double value) {
    return value * 0.10;
  }

  public void withdraw(Double value) {
    Double total = value + withdrawFee(value);
    if (total > balance) {
      throw new RuntimeException("Insufficient balance");
    }
    balance -= total;
  }

  @Override
  public String toString() {
    return String.format("Account number: %d - Holder name: %s - Balance: %.2f", number, holder, balance);
  }
}

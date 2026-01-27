package module13.lesson144abstractclass.entities;

public abstract class Account {

  Integer number;
  String holder;
  protected Double balance;

  public Account(Integer number, String holder, Double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }

  public Double getBalance() {
    return balance;
  }

  public String getHolder() {
    return holder;
  }

  public void deposit(Double amount) {
    this.balance += amount;
  }

  @Override
  public String toString() {
    return "Account{" +
        "number=" + number +
        ", holder='" + holder + '\'' +
        ", balance=" + balance +
        '}';
  }

}

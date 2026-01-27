package module13.lesson140polymorphism.entities;

public class Account {

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

  public void withdraw(Double amount) {
    this.balance -= amount + 5;
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

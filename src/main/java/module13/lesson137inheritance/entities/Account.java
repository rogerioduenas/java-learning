package module13.lesson137inheritance.entities;

public class Account {

  Integer number;
  String holder;
  protected Double balance;

  public Account(Integer number, String holder, Double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }

  public void withdraw(Double amount) {
    this.balance -= amount;
  }

  public void deposit(Double amount) {
    this.balance += amount;
  }
}

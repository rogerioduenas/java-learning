package module09.exercises.ex_8.entities;

public class BankAccount {
  final int number;
  private String holder;
  private double balance;

  public BankAccount(int number, String holder) {
    this.number = number;
    this.holder = holder;
  }
  public BankAccount(int number, String holder, double initialDeposit) {
    this.number = number;
    this.holder = holder;
    deposit(initialDeposit);
  }

  public int getNumber() {
    return number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    this.balance -= (amount + 10);
  }

  public String toString() {
    return String.format("Bank Account%n Number: %d%n Holder: %s%n Balance: %.2f%n", number, holder, this.balance);
  }
}

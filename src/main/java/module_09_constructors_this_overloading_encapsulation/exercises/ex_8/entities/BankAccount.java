package module_09_constructors_this_overloading_encapsulation.exercises.ex_8.entities;

import utils.Validate;

public class BankAccount {
  private final int number;
  private String holder;
  private double balance;

  private static final double WITHDRAW_FEE = 5.0;

  public BankAccount(int number, String holder) {
    this(number, holder, 0.0);
  }

  public BankAccount(int number, String holder, double initialDeposit) {
    Validate.positive(number, "Account number must be positive");
    Validate.notBlank(holder, "Holder cannot be blank");

    this.number = number;
    this.holder = holder;

    if (initialDeposit > 0) {
      deposit(initialDeposit);
    }
  }

  public int getNumber() {
    return number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    Validate.notBlank(holder, "Holder cannot be blank");
    this.holder = holder;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    Validate.positive(amount, "Deposit amount must be positive");
    this.balance += amount;
  }

  public void withdraw(double amount) {
    Validate.positive(amount, "Withdrawal amount must be positive");
    this.balance -= (amount + WITHDRAW_FEE);
  }

  @Override
  public String toString() {
    return String.format("Bank Account%n Number: %d%n Holder: %s%n Balance: %.2f%n", number, holder, this.balance);
  }
}

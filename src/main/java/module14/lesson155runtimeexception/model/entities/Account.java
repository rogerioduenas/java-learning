package module14.lesson155runtimeexception.model.entities;

import module14.lesson155runtimeexception.model.DomainException.DomainException;

public class Account {

  private Integer number;
  private Double balance;
  private Double withdrawLimit;

  public Account(Integer number, Double balance, Double withdrawLimit) {
    this.number = number;
    this.balance = balance;
    this.withdrawLimit = withdrawLimit;
  }

  public void withdraw(Double amount) {
    if (amount <= 0) {
      throw new DomainException("Withdraw amount must be positive");
    }

    if (amount > withdrawLimit) {
      throw new DomainException("The amount exceeds withdraw limit");
    }

    if (amount > balance) {
      throw new DomainException("Not enough balance");
    }

    balance -= amount;
  }

  public Double getBalance() {
    return balance;
  }
}
package module13.lesson140polymorphism.entities;

public class SavingsAccount extends Account {

  private Double interestRate;

  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public void updateBalance() {
    this.balance += this.balance * this.interestRate;
  }

  @Override
  public void withdraw(Double amount) {
    this.balance -= amount;
  }

  @Override
  public String toString() {
    return "SavingsAccount{" +
        "interestRate=" + interestRate +
        ", number=" + number +
        ", holder='" + holder + '\'' +
        ", balance=" + balance +
        '}';
  }
}

package module_13_inheritance_and_polymorphism.lesson_138_upcasting_and_down_casting.entities;

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
  public String toString() {
    return "SavingsAccount{" +
        "interestRate=" + interestRate +
        ", number=" + number +
        ", holder='" + holder + '\'' +
        ", balance=" + balance +
        '}';
  }
}

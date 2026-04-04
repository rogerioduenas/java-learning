package module_13_inheritance_and_polymorphism.lesson_144_abstract_class.entities;

public class SavingsAccount extends Account {

  private Double interestRate;

  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
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

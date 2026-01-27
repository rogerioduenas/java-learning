package module13.lesson139overrideandsuper.entities;

public class BusinessAccount extends Account {

  private Double loanLimit;

  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance);
    this.loanLimit = loanLimit;
  }

  public void loan(Double amount) {
    if (amount <= this.loanLimit) {
      balance += amount - 10;
    }
  }

  @Override
  public void withdraw(Double amount) {
    super.withdraw(amount);
    balance -= 2;
  }

  @Override
  public String toString() {
    return "BusinessAccount{" +
        "loanLimit=" + loanLimit +
        ", number=" + number +
        ", holder='" + holder + '\'' +
        ", balance=" + balance +
        '}';
  }
}

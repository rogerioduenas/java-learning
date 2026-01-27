package module13.lesson138upcastinganddowncasting.entities;

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
  public String toString() {
    return "BusinessAccount{" +
        "loanLimit=" + loanLimit +
        ", number=" + number +
        ", holder='" + holder + '\'' +
        ", balance=" + balance +
        '}';
  }
}

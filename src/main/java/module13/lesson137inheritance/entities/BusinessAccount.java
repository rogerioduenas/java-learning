package module13.lesson137inheritance.entities;

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
    StringBuilder sb = new StringBuilder();
    sb.append("--- Account ---").append("\n").append("number: ").append(this.number).append("\n").append("holder: ").append(this.holder).append("\n").append("balance: ").append(this.balance).append("\n").append("loanLimit: ").append(this.loanLimit);
    return sb.toString();
  }
}

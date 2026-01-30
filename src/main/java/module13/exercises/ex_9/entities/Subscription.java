package module13.exercises.ex_9.entities;

public abstract class Subscription {

  protected String userName;
  protected Double monthlyFee;

  public Subscription(String userName, Double monthlyFee) {
    this.userName = userName;
    this.monthlyFee = monthlyFee;
  }

  public Subscription(String userName) {
    this.userName = userName;
  }


  public abstract Double totalMonthlyFee();
}

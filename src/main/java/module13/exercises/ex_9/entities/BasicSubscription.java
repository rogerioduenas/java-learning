package module13.exercises.ex_9.entities;

public class BasicSubscription extends Subscription {

  public BasicSubscription(String userName, Double monthlyFee) {
    super(userName, monthlyFee);
  }

  @Override
  public Double totalMonthlyFee() {
    return monthlyFee;
  }
}

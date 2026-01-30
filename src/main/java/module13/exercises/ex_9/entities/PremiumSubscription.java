package module13.exercises.ex_9.entities;

public class PremiumSubscription extends Subscription {

  private Double bonusServices;

  public PremiumSubscription(String userName, Double monthlyFee, Double bonusServices) {
    super(userName, monthlyFee);
    this.bonusServices = bonusServices;
  }

  @Override
  public Double totalMonthlyFee() {
    return monthlyFee + bonusServices;
  }
}

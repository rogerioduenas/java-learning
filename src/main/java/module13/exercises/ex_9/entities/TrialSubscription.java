package module13.exercises.ex_9.entities;

public class TrialSubscription extends Subscription {

  private int trialDays;

  public TrialSubscription(String userName, int trialDays) {
    super(userName);
    this.trialDays = trialDays;
  }

  @Override
  public Double totalMonthlyFee() {
    return 0.0;
  }
}

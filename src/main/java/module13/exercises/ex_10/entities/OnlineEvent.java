package module13.exercises.ex_10.entities;

public class OnlineEvent extends Event {

  private Double platformFee;

  public OnlineEvent(String title, Double baseCost, Double platformFee) {
    super(title, baseCost);
    this.platformFee = platformFee;
  }

  @Override
  public Double totalCost() {
    return getBaseCost() + platformFee;
  }
}

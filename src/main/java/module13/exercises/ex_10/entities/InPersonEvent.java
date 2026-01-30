package module13.exercises.ex_10.entities;

public class InPersonEvent extends Event {

  private Double locationCost;

  public InPersonEvent(String title, Double baseCost, Double locationCost) {
    super(title, baseCost);
    this.locationCost = locationCost;
  }

  @Override
  public Double totalCost() {
    return getBaseCost() + locationCost;
  }
}

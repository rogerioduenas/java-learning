package module13.exercises.ex_10.entities;

public abstract class Event {

  private String title;
  private Double baseCost;

  public Event(String title, Double baseCost) {
    this.title = title;
    this.baseCost = baseCost;
  }

  public Double getBaseCost() {
    return baseCost;
  }

  public abstract Double totalCost();
}

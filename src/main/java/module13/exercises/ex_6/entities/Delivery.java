package module13.exercises.ex_6.entities;

public abstract class Delivery {

  private int id;
  private String destination;
  private Double baseCost;

  public Delivery(int id, String destination, Double baseCost) {
    this.id = id;
    this.destination = destination;
    this.baseCost = baseCost;
  }

  public final Double calculateTotalCost() {
    return baseCost * costMultiplier();
  }

  protected abstract Double costMultiplier();
}

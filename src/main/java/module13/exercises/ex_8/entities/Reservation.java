package module13.exercises.ex_8.entities;

public abstract class Reservation {

  protected Double costPerHour;
  protected String resourceName;
  protected int duration;

  public Reservation(Double costPerHour, String resourceName, int duration) {
    this.costPerHour = costPerHour;
    this.resourceName = resourceName;
    this.duration = duration;
  }

  public abstract Double totalCost();
}

package module13.exercises.ex_8.entities;

public class PriorityReservation extends Reservation {

  private Double extraCost;

  public PriorityReservation(Double costPerHour, String resourceName, int duration, Double extraCost) {
    super(costPerHour, resourceName, duration);
    this.extraCost = extraCost;
  }

  @Override
  public Double totalCost() {
    return duration * costPerHour + extraCost;
  }
}

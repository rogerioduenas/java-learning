package module_13_inheritance_and_polymorphism.exercises.ex_8.entities;

public class CommonReservation extends Reservation {

  public CommonReservation(Double costPerHour, String resourceName, int duration) {
    super(costPerHour, resourceName, duration);
  }

  @Override
  public Double totalCost() {
    return duration * costPerHour;
  }
}

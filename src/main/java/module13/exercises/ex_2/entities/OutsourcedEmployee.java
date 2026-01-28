package module13.exercises.ex_2.entities;

public class OutsourcedEmployee extends Employee {

  private Double additionalCharge;

  public OutsourcedEmployee(String name, Integer hoursWorked, Double valuePerHour, Double additionalCharge) {
    super(name, hoursWorked, valuePerHour);
    this.additionalCharge = additionalCharge;
  }

  @Override
  public Double payment() {
    return super.payment() + additionalCharge * 1.1;
  }

  @Override
  public String toString() {
    return String.format("%s - Additional: $%.2f", super.toString(), additionalCharge);
  }
}

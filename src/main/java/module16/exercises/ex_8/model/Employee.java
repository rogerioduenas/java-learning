package module16.exercises.ex_8.model;

public class Employee {
  private String name;
  private Integer hoursLate;
  private Integer deliveries;

  public Employee(String name, Integer hoursLate, Integer deliveries) {
    this.name = name;
    this.hoursLate = hoursLate;
    this.deliveries = deliveries;
  }

  public String getName() { return name; }
  public Integer getHoursLate() { return hoursLate; }
  public Integer getDeliveries() { return deliveries; }
}

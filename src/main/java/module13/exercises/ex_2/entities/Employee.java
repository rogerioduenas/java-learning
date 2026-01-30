
package module13.exercises.ex_2.entities;
public class Employee {

  private String name;
  private Integer hoursWorked;
  private Double valuePerHour;

  public Employee(String name, Integer hoursWorked, Double valuePerHour) {
    this.name = name;
    this.hoursWorked = hoursWorked;
    this.valuePerHour = valuePerHour;
  }

  public Double payment() {
    return this.hoursWorked * this.valuePerHour;
  }

  @Override
  public String toString() {
    return String.format("Name: %s - Hours Worked: %d - Value Per Hour: $%.2f", name, hoursWorked, valuePerHour);
  }
}

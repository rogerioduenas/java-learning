package module_13_inheritance_and_polymorphism.lesson_142_solved_exercise.entities;

public class Employee {

  private String name;
  private Integer hours;
  private Double valuePerHour;

  public Employee(String name, Integer hours, Double valuePerHour) {
    this.name = name;
    this.hours = hours;
    this.valuePerHour = valuePerHour;
  }

  public String getName() {
    return name;
  }

  public Double payment() {
    return valuePerHour * hours;
  }
}

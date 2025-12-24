package module10.exercises.ex_6.entities;

public class Employee {
  private final Integer id;
  private final String name;
  private Double salary;

  public Employee(Integer id, String name, Double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public Integer getId() {
    return id;
  }

  public void increaseSalary(Integer percentage) {
    if (percentage <= 0) return;
    this.salary *= 1 + (double) percentage / 100;
  }

  @Override
  public String toString() {
    return String.format("%nId: %d | Name: %s | Salary: %.2f", id, name, salary);
  }
}

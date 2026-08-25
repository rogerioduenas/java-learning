package module_09_constructors_this_overloading_encapsulation.exercises.ex_2.entities;

public class Employee {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    validateData(name, salary);
    this.name = name;
    this.salary = salary;
  }

  private void validateData(String name, double salary) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Employee name cannot be null or blank");
    }

    if (salary < 0) {
      throw new IllegalArgumentException("Employee salary cannot be negative");
    }
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public double calculateAnnualIncome() {
    return this.salary * 12;
  }

  public String toString() {
    return String.format("Name: %s - Salary: %.2f - Annual income: %.2f", this.name, this.salary, calculateAnnualIncome());
  }
}

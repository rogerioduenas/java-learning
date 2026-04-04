package module_09_constructors_this_overloading_encapsulation.exercises.ex_2.entities;

public class Employee {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public double calculateAnnualIncome() {
    return this.salary * 12;
  }

  public String toString() {
    return String.format("Name: %s - Salary: %.2f - Annual income: %.2f", this.name, this.salary, calculateAnnualIncome());
  }
}

package module16.exercises.ex_6.model;

public class Employee implements Comparable<Employee>{

  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  @Override
  public int compareTo(Employee other) {
    int nameCompare = this.name.compareTo(other.name);
    if (nameCompare == 0) {
      return Double.compare(other.salary, this.salary);
    }
    return nameCompare;
  }

  @Override
  public String toString() {
    return String.format("Name: %s, Salary: %.2f%n", name, salary);
  }
}

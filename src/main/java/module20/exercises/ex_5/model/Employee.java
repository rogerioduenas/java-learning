package module20.exercises.ex_5.model;

public class Employee {

  private Long id;
  private String name;
  private Double salary;

  private Department department;

  public Employee(Long id, String name, Double salary, Department department) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.department = department;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getSalary() {
    return salary;
  }

  public Department getDepartment() {
    return department;
  }

  @Override
  public String toString() {
    return String.format("Id: %d, Name: %s, Salary: %s, Department: %s", id, name, salary, department.getName());
  }
}

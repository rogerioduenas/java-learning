package module12.exercises.ex_3.entities;

public class Employee {

  private String name;
  private double salary;

  private Department department;

  private Employee(String name, double salary, Department department) {
    this.name = name;
    this.salary = salary;
    this.department = department;
  }

  public static Employee createEmployee(String name, double salary, String department) {
    return new Employee(name, salary, new Department(department));
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", salary=" + salary +
        ", department=" + department.getName() +
        '}';
  }
}

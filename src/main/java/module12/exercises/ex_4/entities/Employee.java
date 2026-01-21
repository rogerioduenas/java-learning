package module12.exercises.ex_4.entities;

public class Employee {

  private String name;
  private double salary;
  private EmployeeLevel level;
  private Department department;

  private Employee(String name, double salary, EmployeeLevel level, Department department) {
    this.name = name;
    this.salary = salary;
    this.level = level;
    this.department = department;
  }

  public static Employee createEmployee(String name, double salary, EmployeeLevel level, String department) {
    return new Employee(name, salary, level, new Department(department));
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", salary=" + salary +
        ", level=" + level +
        ", department=" + department +
        '}';
  }
}

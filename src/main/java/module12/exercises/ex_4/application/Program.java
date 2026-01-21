package module12.exercises.ex_4.application;

import module12.exercises.ex_4.entities.Employee;
import module12.exercises.ex_4.entities.EmployeeLevel;

public class Program {
  public static void main(String[] args) {
    Employee employee = Employee.createEmployee("Mike", 1200.0, EmployeeLevel.MID, "Design");
    System.out.println(employee);
  }
}

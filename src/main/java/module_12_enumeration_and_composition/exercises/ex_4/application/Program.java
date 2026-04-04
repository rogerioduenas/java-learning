package module_12_enumeration_and_composition.exercises.ex_4.application;

import module_12_enumeration_and_composition.exercises.ex_4.entities.Employee;
import module_12_enumeration_and_composition.exercises.ex_4.entities.EmployeeLevel;

public class Program {
  public static void main(String[] args) {
    Employee employee = Employee.createEmployee("Mike", 1200.0, EmployeeLevel.MID, "Design");
    System.out.println(employee);
  }
}

package module_12_enumeration_and_composition.exercises.ex_3.application;

import module_12_enumeration_and_composition.exercises.ex_3.entities.Employee;

public class Program {
  public static void main(String[] args) {

    Employee employee = Employee.createEmployee("Mike", 1200.0, "Design");
    System.out.println(employee);
  }
}

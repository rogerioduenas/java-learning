package module12.exercises.ex_3.application;

import module12.exercises.ex_3.entities.Employee;

public class Program {
  public static void main(String[] args) {

    Employee employee = Employee.createEmployee("Mike", 1200.0, "Design");
    System.out.println(employee);
  }
}

package module13.exercises.ex_2.application;

import module13.exercises.ex_2.entities.Employee;
import module13.exercises.ex_2.entities.OutsourcedEmployee;

public class Program {
  public static void main(String[] args) {

    Employee employee = new Employee("Mike", 160, 35.0);
    System.out.printf("%s - Salary: $%.2f%n", employee, employee.payment());

    Employee outsourcedEmployee = new OutsourcedEmployee("Anna", 40, 40.0, 500.0);
    System.out.printf("%s - Salary: $%.2f%n", outsourcedEmployee, outsourcedEmployee.payment());

  }
}

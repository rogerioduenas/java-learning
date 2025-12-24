package module10.exercises.ex_6.application;

import module10.exercises.ex_6.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    employeeRegistration(employees, sc);
    increaseSalary(employees, sc);

    System.out.println(employees);
    sc.close();
  }

  public static void employeeRegistration(List<Employee> employees, Scanner sc) {
    System.out.println("Enter number of employees: ");
    int quantity = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < quantity; i++) {
      Integer id;

      while (true) {
        System.out.printf("Enter Id employee number %d: ", i + 1);
        id = sc.nextInt();
        sc.nextLine();

        if (findById(employees, id) == null) {
          break;
        }

        System.out.printf("Id %d already exists%n", id);
      }

      System.out.println("Enter Name: ");
      String name = sc.nextLine();

      System.out.println("Enter Salary: ");
      double salary = sc.nextDouble();
      sc.nextLine();

      employees.add(new Employee(id, name, salary));
    }
  }

  public static void increaseSalary(List<Employee> employees, Scanner sc) {
    while (true) {
      System.out.println("Enter Id employee to increase salary: ");
      Integer id = sc.nextInt();
      sc.nextLine();

      Employee employee = findById(employees, id);

      if (employee != null) {
        System.out.println("Enter percentage to increase salary:");
        int percentage = sc.nextInt();
        sc.nextLine();

        employee.increaseSalary(percentage);
        break;
      }

      System.out.println("Employee id doesn't exist");
    }
  }

  public static Employee findById(List<Employee> employees, Integer id) {
    for (Employee employee : employees) {
      if (employee.getId().equals(id)) {
        return employee;
      }
    }
    return null;
  }
}

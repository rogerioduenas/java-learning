package module09.exercises.ex_2.application;

import module09.exercises.ex_2.entities.Employee;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter employee's name: ");
    String name = sc.nextLine();
    System.out.println("Enter employee's salary: ");
    double salary = sc.nextDouble();

    Employee employee = new Employee(name, salary);

    System.out.println(employee);

    sc.close();
  }
}

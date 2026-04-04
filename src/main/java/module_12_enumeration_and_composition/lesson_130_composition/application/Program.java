package module_12_enumeration_and_composition.lesson_130_composition.application;

import module_12_enumeration_and_composition.lesson_130_composition.entities.Department;
import module_12_enumeration_and_composition.lesson_130_composition.entities.HourContract;
import module_12_enumeration_and_composition.lesson_130_composition.entities.Worker;
import module_12_enumeration_and_composition.lesson_130_composition.entities.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String departmentName = sc.nextLine();
    System.out.println("Enter worker data:");
    System.out.print("Name: ");
    String workerName = sc.nextLine();
    System.out.print("Level: ");
    String workerLevel = sc.nextLine();
    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(
        workerName,
        WorkerLevel.valueOf(workerLevel),
        baseSalary,
        new Department(departmentName));

    System.out.print("How many contracts to this worker? ");
    int numberOfContracts = sc.nextInt();

    for (int i = 1; i <= numberOfContracts; i++) {
      System.out.println("Enter contract #" + i + " data:");
      System.out.print("Date (DD/MM/YYYY): ");
      LocalDate contractDate = LocalDate.parse(sc.next(), formatter);
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();

      HourContract contract = new HourContract(contractDate, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    sc.close();
  }
}

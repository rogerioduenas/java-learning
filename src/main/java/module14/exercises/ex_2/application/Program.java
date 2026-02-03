package module14.exercises.ex_2.application;

import module14.exercises.ex_2.entities.Appointment;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("----- Appointment -----");
    try {
      System.out.print("Enter Name: ");
      String name = sc.nextLine();

      System.out.print("Enter Start Date and time: (dd/MM/yyyy HH:mm) ");
      LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(), Appointment.FMT);

      System.out.print("Enter End Date and time: (dd/MM/yyyy HH:mm) ");
      LocalDateTime endDate = LocalDateTime.parse(sc.nextLine(), Appointment.FMT);

      Appointment appointment = new Appointment(name, startDate, endDate);
      System.out.printf("Appointment successfully scheduled: %n%s", appointment);

    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Unexpected error: Please ensure you enter the values in the correct formats.");
    }
    sc.close();
  }
}

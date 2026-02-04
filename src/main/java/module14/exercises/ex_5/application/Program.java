package module14.exercises.ex_5.application;

import module14.exercises.ex_5.domain.domain.exception.DomainException;
import module14.exercises.ex_5.domain.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    try {
      System.out.print("Enter the name: ");
      String name = sc.nextLine();

      System.out.print("Enter start date: (DD/MM/YYYY) ");
      LocalDate startDate = LocalDate.parse(sc.nextLine(), fmt);

      System.out.print("Enter end date: (DD/MM/YYYY) ");
      LocalDate endDate = LocalDate.parse(sc.nextLine(), fmt);

      Reservation reservation = new Reservation(name, startDate, endDate);
      System.out.println(reservation);

      LocalDate newStartDate = LocalDate.parse("30/12/1990", fmt);
      LocalDate newEndDate = LocalDate.parse("29/12/1990", fmt);
      reservation.updatePeriod(newStartDate, newEndDate);

      System.out.println(reservation);

    } catch (DomainException e) {
      System.out.println("Error in reservation: " + e.getMessage());

    } catch (DateTimeParseException e) {
      System.out.println("Invalid date format!");

    } catch (RuntimeException e) {
      System.out.println("Unexpected error.");
    }
    sc.close();

  }
}

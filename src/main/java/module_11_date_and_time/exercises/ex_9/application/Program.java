package module_11_date_and_time.exercises.ex_9.application;

import module_11_date_and_time.exercises.ex_9.entities.DateCalculator;

import java.time.LocalDate;

public class Program {
  public static void main(String[] args) {

    LocalDate today = LocalDate.now();
    System.out.println(DateCalculator.calculateFutureDate(today, 2));
    System.out.println(DateCalculator.calculatePastDate(today, 2));
  }
}

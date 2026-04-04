package module_11_date_and_time.exercises.ex_9.entities;

import java.time.LocalDate;

public class DateCalculator {

  public static LocalDate calculateFutureDate(LocalDate date, int quantityOfDays) {
    return date.plusDays(quantityOfDays);
  }

  public static LocalDate calculatePastDate(LocalDate date, int quantityOfDays) {
    return date.minusDays(quantityOfDays);
  }
}

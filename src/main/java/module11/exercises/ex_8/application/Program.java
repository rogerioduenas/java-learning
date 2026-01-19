package module11.exercises.ex_8.application;

import module11.exercises.ex_8.entities.DateInfoService;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Program {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    Integer dayOfMonth = DateInfoService.getDayOfMonth(today);
    DayOfWeek dayWeek = DateInfoService.getDayOfWeek(today);
    Month month = DateInfoService.getMonth(today);
    Integer year = DateInfoService.getYear(today);

    System.out.printf(
        "Day of month: %d%n" +
            "Day of week: %s%n" +
            "Month: %s%n" +
            "Year: %d%n",
        dayOfMonth, dayWeek, month, year);
  }
}

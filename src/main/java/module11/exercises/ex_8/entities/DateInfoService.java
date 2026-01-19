package module11.exercises.ex_8.entities;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateInfoService {

  public static Integer getDayOfMonth(LocalDate localDate) {
    return localDate.getDayOfMonth();
  }

  public static DayOfWeek getDayOfWeek(LocalDate localDate) {
    return localDate.getDayOfWeek();
  }

  public static Month getMonth(LocalDate localDate) {
    return localDate.getMonth();
  }

  public static Integer getYear(LocalDate localDate) {
    return localDate.getYear();
  }
}

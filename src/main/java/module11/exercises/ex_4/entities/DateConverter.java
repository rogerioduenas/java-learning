package module11.exercises.ex_4.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class DateConverter {

  public static LocalDate instantToLocalDate(Instant instant) {
    ZoneId systemZoneId = ZoneId.systemDefault();
    return LocalDate.ofInstant(instant, systemZoneId);
  }
}

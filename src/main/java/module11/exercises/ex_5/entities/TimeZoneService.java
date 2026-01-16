package module11.exercises.ex_5.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class TimeZoneService {

  public static LocalDate toLocalDate(Instant instant, String zoneId) {
    return LocalDate.ofInstant(instant, ZoneId.of(zoneId));
  }
}

package module11.exercises.ex_10.entities;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class DurationService {

  public static long getDurationBetweenInstant(Instant start, Instant end) {
    return Duration.between(start, end).toDays();
  }

  public static long getDurationBetweenDateTime(LocalDateTime start, LocalDateTime end) {
    return Duration.between(start, end).toHours();
  }
}

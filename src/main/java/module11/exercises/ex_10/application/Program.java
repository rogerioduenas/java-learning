package module11.exercises.ex_10.application;

import module11.exercises.ex_10.entities.DurationService;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
  public static void main(String[] args) {

    Instant startInstant = Instant.now();
    Instant endInstant = startInstant.plus(18, ChronoUnit.DAYS);
    LocalDateTime startDateTime = LocalDateTime.now();
    LocalDateTime endDateTime = startDateTime.plusDays(5);


    long durationInstant = DurationService.getDurationBetweenInstant(startInstant, endInstant);
    long durationDateTime = DurationService.getDurationBetweenDateTime(startDateTime, endDateTime);

    System.out.println(durationInstant);
    System.out.println(durationDateTime);
  }
}

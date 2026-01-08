package module11.lesson120calculationswithdateandtime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
  public static void main(String[] args) {

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();

    LocalDate pastWeekLocalDate = d01.minusDays(7);
    LocalDate nextWeekLocalDate = d01.plusDays(7);
    System.out.printf("Past week local date: %s%n", pastWeekLocalDate);
    System.out.printf("Next week local date: %s%n", nextWeekLocalDate);

    LocalDateTime lessTwoHours = d02.minusHours(2);
    LocalDateTime plusFiveHours = d02.plusHours(5);
    System.out.printf("Less Two Hours: %s%n", lessTwoHours);
    System.out.printf("Plus Five Hours: %s%n", plusFiveHours);

    Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
    Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
    System.out.printf("Past week Instant: %s%n", pastWeekInstant);
    System.out.printf("Next week Instant: %s%n", nextWeekInstant);

    //Local date
    Duration t01 = Duration.between(d01.atStartOfDay(), pastWeekLocalDate.atStartOfDay());
    System.out.printf("Duration Local date: %s days%n", t01.toDays());

    //Local date time
    Duration t02 = Duration.between(d02, plusFiveHours);
    System.out.printf("Duration Local date time: %s hours %n", t02.toHours());

    //Instant
    Duration t03 = Duration.between(d03, nextWeekInstant);
    System.out.printf("Duration instant: %s minutes%n", t03.toMinutes());
  }
}

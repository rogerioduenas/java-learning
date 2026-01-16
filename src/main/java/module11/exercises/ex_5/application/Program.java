package module11.exercises.ex_5.application;

import module11.exercises.ex_5.entities.TimeZoneService;

import java.time.Instant;

public class Program {

  public static void main(String[] args) {
    Instant instant = Instant.now();

    System.out.println(TimeZoneService.toLocalDate(instant, "America/Los_Angeles"));
    System.out.println(TimeZoneService.toLocalDate(instant, "America/Toronto"));
    System.out.println(TimeZoneService.toLocalDate(instant, "Asia/Tokyo"));

  }
}

package module11.lesson118convertingdateandtimetotext;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
  public static void main(String[] args) {

    LocalDate d01 = LocalDate.parse("2026-01-08");
    LocalDateTime d02 = LocalDateTime.parse("2026-01-08T13:55");
    Instant d03 = Instant.parse("2026-01-08T23:55:00Z");

    DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.printf("d01 - Date: %s%n", d01.format(fmt01));
    System.out.printf("d01 - Date: %s%n", fmt01.format(d01));

    DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    System.out.printf("d02 - Date and time: %s%n", d02.format(fmt02));
    System.out.printf("d02 - Date and time: %s%n", fmt02.format(d02));

    DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
    System.out.printf("d03 - Date, time and zone: %s%n", fmt03.format(d03));

    //without ofPattern - Data Time
    DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
    System.out.printf("d02 - Date and time: %s%n", fmt04.format(d02));

    //Instant
    DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;
    System.out.printf("d03 - Date, time and zone: %s%n", fmt05.format(d03));

  }
}

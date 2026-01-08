package module11.lesson119globaldateandtimetolocaldateandtime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
  public static void main(String[] args) {

    Instant gdt = Instant.parse("2026-01-08T23:55:00Z");

    LocalDate d01 = LocalDate.ofInstant(gdt, ZoneId.systemDefault());
    System.out.printf("d01 - Global Date to Local Date: %s%n", d01);

    LocalDate d02 = LocalDate.ofInstant(gdt, ZoneId.of("Asia/Tokyo"));
    System.out.printf("d02 - Global Date to Japan Date: %s%n", d02);

    LocalDateTime d03 = LocalDateTime.ofInstant(gdt, ZoneId.of("America/Los_Angeles"));
    System.out.printf("d03 - Global Date Time to LA Date Time: %s%n", d03);

    LocalDate d04 = LocalDate.now();
    System.out.printf("Get day of month: %s%n", d04.getDayOfMonth());
    System.out.printf("Get day of week: %s%n", d04.getDayOfWeek());
    System.out.printf("Get month name: %s%n", d04.getMonth());

  }
}

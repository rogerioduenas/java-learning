package module11.lesson117instantiatingdateandtime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
  public static void main(String[] args) {

    // Current system date (no time, no timezone)
    LocalDate d01 = LocalDate.now();
    System.out.printf("01 - Local Date: %s%n", d01);

    // Current system date and time (no timezone)
    LocalDateTime d02 = LocalDateTime.now();
    System.out.printf("02 - Local Date Time: %s%n", d02);

    // Current timestamp in UTC (absolute instant)
    Instant d03 = Instant.now();
    System.out.printf("03 - Instant: %s%n", d03);

    // Parse ISO-8601 text into LocalDate
    LocalDate d04 = LocalDate.parse("2026-01-07");
    System.out.printf("04 - Local Date: %s%n", d04);

    // Parse ISO-8601 text into LocalDateTime
    LocalDateTime d05 = LocalDateTime.parse("2026-01-07T01:30:25");
    System.out.printf("05 - Local Date Time: %s%n", d05);

    // Parse ISO-8601 UTC text (Z) into Instant
    Instant d06 = Instant.parse("2026-01-07T01:30:26Z");
    System.out.printf("06 - Instant: %s%n", d06);

    // Parse ISO-8601 text with offset into Instant (normalized to UTC)
    Instant d07 = Instant.parse("2026-01-07T01:30:27+09:00");
    System.out.printf("07 - Instant: %s%n", d07);

    // Define custom date formatter (day/month/year)
    DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    // Parse custom-formatted text into LocalDate
    LocalDate d08 = LocalDate.parse("07/01/2026", fmt01);
    System.out.printf("08 - Local Date: %s%n", d08);

    // Define custom date-time formatter
    DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    // Parse custom-formatted text into LocalDateTime
    LocalDateTime d09 = LocalDateTime.parse("07/01/2026 01:30", fmt02);
    System.out.printf("09 - Local Date Time: %s%n", d09);

    // Create LocalDate from explicit year, month, and day values
    LocalDate d10 = LocalDate.of(2026, 1, 1);
    System.out.printf("10 - Local Date: %s%n", d10);

    // Create LocalDateTime from explicit date and time components
    LocalDateTime d11 = LocalDateTime.of(2026, 1, 1, 13, 55);
    System.out.printf("11 - Local Date: %s%n", d11);
  }
}

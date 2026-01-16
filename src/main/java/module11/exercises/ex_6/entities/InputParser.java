package module11.exercises.ex_6.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class InputParser {

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public static LocalDate parseDate(String date) {
    try {
      return LocalDate.parse(date, FORMATTER);
    } catch (DateTimeParseException e) {
      throw new IllegalArgumentException(
          "Invalid date format. Expected dd/MM/yyyy", e
      );
    }
  }
}

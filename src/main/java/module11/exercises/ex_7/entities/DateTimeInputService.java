package module11.exercises.ex_7.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeInputService {

  private static final DateTimeFormatter FORMATTER =
      DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

  public static LocalDateTime convertStringToDateTime(String dateTimeString) {
    return LocalDateTime.parse(dateTimeString, FORMATTER);
  }
}

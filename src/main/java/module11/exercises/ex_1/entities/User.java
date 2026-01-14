package module11.exercises.ex_1.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {

  private final String name;
  private final Integer id;
  private final LocalDate registrationDate;

  public User(String name, Integer id, LocalDate registrationDate) {
    this.name = name;
    this.id = id;
    this.registrationDate = registrationDate;
  }

  public String getFormattedRegistrationDate() {
    DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return registrationDate.format(formatter);
  }
}

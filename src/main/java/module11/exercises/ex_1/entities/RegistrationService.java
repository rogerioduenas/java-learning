package module11.exercises.ex_1.entities;

import java.time.LocalDate;

public class RegistrationService {

  public User createUser(String name, Integer id) {
    LocalDate registrationDate = LocalDate.now();
    return new User(name, id, registrationDate);
  }
}

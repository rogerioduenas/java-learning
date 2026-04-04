package module_11_date_and_time.exercises.ex_1.entities;

import java.time.LocalDate;

public class RegistrationService {

  public User createUser(String name, Integer id) {
    LocalDate registrationDate = LocalDate.now();
    return new User(name, id, registrationDate);
  }
}

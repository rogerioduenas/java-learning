package module11.exercises.ex_1.application;

import module11.exercises.ex_1.entities.RegistrationService;
import module11.exercises.ex_1.entities.User;

public class Program {

  public static void main(String[] args) {

    RegistrationService service = new RegistrationService();
    User user = service.createUser("Mike", 12345);

    System.out.println(user.getFormattedRegistrationDate());
  }
}

package module14.exercises.ex_6.services;

import module14.exercises.ex_6.domain.exceptions.DomainException;
import module14.exercises.ex_6.domain.entities.User;

import java.util.ArrayList;
import java.util.List;

public class AuthenticateService {

  public List<User> users = new ArrayList<>();

  public void addUser(User user) {
    this.users.add(user);
  }

  public void authenticate(String email, String password) throws DomainException {
    Boolean found = false;
    for (User user : this.users) {
      if (user.getEmail().equals(email)) {
        if (user.getPassword().equals(password)) {
          found = true;
          System.out.printf("The user (%s) was successfully authenticated.%n", user.getEmail());
          break;
        }
      }
    }
    if (!found) {
      throw new DomainException("----- User or password is invalid -----");
    }
  }
}

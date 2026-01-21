package module12.exercises.ex_1.application;

import module12.exercises.ex_1.entities.User;
import module12.exercises.ex_1.entities.UserLevel;

public class Program {
  public static void main(String[] args) {

    User user = User.createUser(123, "Mike", UserLevel.BASIC);
    System.out.println(user);
  }
}

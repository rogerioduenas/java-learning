package module_12_enumeration_and_composition.exercises.ex_1.application;

import module_12_enumeration_and_composition.exercises.ex_1.entities.User;
import module_12_enumeration_and_composition.exercises.ex_1.entities.UserLevel;

public class Program {
  public static void main(String[] args) {

    User user = User.createUser(123, "Mike", UserLevel.BASIC);
    System.out.println(user);
  }
}

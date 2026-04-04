package module_13_inheritance_and_polymorphism.lesson_137_inheritance.application;

import module_13_inheritance_and_polymorphism.lesson_137_inheritance.entities.Account;
import module_13_inheritance_and_polymorphism.lesson_137_inheritance.entities.BusinessAccount;

public class Program {
  public static void main(String[] args) {
    Account account = new BusinessAccount(1001, "Mike", 5000.0, 1000.0);
    System.out.println(account);
  }
}

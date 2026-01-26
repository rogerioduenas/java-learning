package module13.lesson137inheritance.application;

import module13.lesson137inheritance.entities.Account;
import module13.lesson137inheritance.entities.BusinessAccount;

public class Program {
  public static void main(String[] args) {
    Account account = new BusinessAccount(1001, "Mike", 5000.0, 1000.0);
    System.out.println(account);
  }
}

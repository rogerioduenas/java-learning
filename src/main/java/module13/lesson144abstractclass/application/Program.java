package module13.lesson144abstractclass.application;

import module13.lesson144abstractclass.entities.Account;
import module13.lesson144abstractclass.entities.BusinessAccount;
import module13.lesson144abstractclass.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    // Account cannot be instantiated because Account is an abstract class.
    // Account acc1 = new Account(1001, "Mike", 500.00);
    Account acc2 = new SavingsAccount(1002, "Maria", 2000.0, 0.01);
    Account acc3 = new BusinessAccount(1003, "John", 1000.0, 500.0);
    Account acc4 = new SavingsAccount(1004, "Mike", 500.0, 0.01);
    Account acc5 = new BusinessAccount(1005, "Anna", 6000.0, 3000.0);

    List<Account> accounts = new ArrayList<>();

    accounts.add(acc2);
    accounts.add(acc3);
    accounts.add(acc4);
    accounts.add(acc5);

    Double total = 0.0;
    for (Account acc : accounts) {
      total += acc.getBalance();
    }
    System.out.println(total);

    for (Account acc : accounts) {
      acc.deposit(10.0);
    }

    for (Account acc : accounts) {
      System.out.printf("Name: %s - Balance: %.2f%n", acc.getHolder(), acc.getBalance());
    }
  }
}

package module14.lesson155runtimeexception.application;

import module14.lesson155runtimeexception.model.entities.Account;

public class Program {

  public static void main(String[] args) {

    Account acc = new Account(1001, 500.0, 1000.0);

    acc.withdraw(300.0);

    System.out.println("New balance: " + acc.getBalance());
  }
}

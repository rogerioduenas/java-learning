package module_14_exception_handling.lesson_155_runtime_exception.application;

import module_14_exception_handling.lesson_155_runtime_exception.model.entities.Account;

public class Program {

  public static void main(String[] args) {

    Account acc = new Account(1001, 500.0, 1000.0);

    acc.withdraw(300.0);

    System.out.println("New balance: " + acc.getBalance());
  }
}

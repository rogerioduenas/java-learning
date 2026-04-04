package module_13_inheritance_and_polymorphism.lesson_140_polymorphism.application;

import module_13_inheritance_and_polymorphism.lesson_140_polymorphism.entities.Account;
import module_13_inheritance_and_polymorphism.lesson_140_polymorphism.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {

    Account acc1 = new Account(1001, "John", 1000.0);
    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.1);

    acc1.withdraw(50.0); //it has tax
    acc2.withdraw(50.0); //it doesn't have tax

    System.out.println(acc1.getBalance());
    System.out.println(acc2.getBalance());

  }
}


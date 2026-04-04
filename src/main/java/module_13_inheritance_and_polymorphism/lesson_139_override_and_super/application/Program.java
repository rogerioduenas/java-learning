package module_13_inheritance_and_polymorphism.lesson_139_override_and_super.application;

import module_13_inheritance_and_polymorphism.lesson_139_override_and_super.entities.Account;
import module_13_inheritance_and_polymorphism.lesson_139_override_and_super.entities.BusinessAccount;
import module_13_inheritance_and_polymorphism.lesson_139_override_and_super.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {

    //standard
    Account acc1 = new Account(1001, "Mike", 1000.0);
    acc1.withdraw(200.0);
    System.out.println(acc1.getBalance());

    //using override
    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.1);
    acc2.withdraw(200.0);
    System.out.println(acc2.getBalance());

    //using override but with SUPER
    Account acc3 = new BusinessAccount(1003, "John", 1000.0, 500.0);
    acc3.withdraw(200.0);
    System.out.println(acc3.getBalance());
  }
}


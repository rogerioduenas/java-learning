package module13.exercises.ex_3.application;

import module13.exercises.ex_3.entities.Account;
import module13.exercises.ex_3.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {

    Account account = new Account(1000, "Mike", 1000.0);
    account.withdraw(900.0);
    System.out.println(account);

    Account savingAccount = new SavingsAccount(1001, "Anna", 1000.0);
    savingAccount.withdraw(900.0);
    System.out.println(savingAccount);

  }
}

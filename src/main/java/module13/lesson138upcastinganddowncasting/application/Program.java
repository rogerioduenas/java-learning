package module13.lesson138upcastinganddowncasting.application;

import module13.lesson138upcastinganddowncasting.entities.Account;
import module13.lesson138upcastinganddowncasting.entities.BusinessAccount;
import module13.lesson138upcastinganddowncasting.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {
    Account acc = new Account(1001, "Mike", 5000.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    //UPCASTING
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "John", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "John", 0.0, 200.0);

    //DOWNCASTING

    //BusinessAccount acc4 = acc2; it cannot, see below
    BusinessAccount acc4 = (BusinessAccount) acc2;

    //BusinessAccount acc5 = (BusinessAccount) acc3; That's also not possible, even if the compiler isn't complaining.
    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      System.out.println(acc5);
      // It will be always false because acc3 is an instance of SavingsAccount
    }
    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      System.out.println(acc5);
    }
  }
}


package module09.exercises.ex_8.application;

import module09.exercises.ex_8.entities.BankAccount;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of account: ");
    int number = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the holder of the account: ");
    String holder = sc.nextLine();

    BankAccount newAccount = new BankAccount(number, holder);
    System.out.println(newAccount);

    System.out.println("Enter your first deposit into your account: ");
    double deposit = sc.nextDouble();
    newAccount.deposit(deposit);
    System.out.println(newAccount);

    System.out.println("Enter your first withdrawal into your account: ");
    double withdrawal = sc.nextDouble();
    newAccount.withdraw(withdrawal);
    System.out.println(newAccount);

    System.out.println("This is your current balance: ");
    System.out.println(newAccount.getBalance());

    sc.close();
  }
}

package module14.exercises.ex_3.application;

import module14.exercises.ex_3.entities.InstallmentPayment;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char answer = 'y';

    while (answer == 'y') {
      try {
        System.out.print("Enter product value: ");
        double value = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter number of Installments: ");
        int numberOfInstallments = sc.nextInt();
        sc.nextLine();

        InstallmentPayment installmentPayment = new InstallmentPayment(value, numberOfInstallments);
        System.out.println(installmentPayment);

      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());

      } catch (Exception e) {
        sc.nextLine();
        System.out.println("Something went wrong. Please try again.");

      } finally {
        System.out.print("Do you want to do it again? (y/n): ");
        answer = sc.next().charAt(0);
        if (answer != 'y') {
          System.out.println("Thanks for using this program.");
        }
        System.out.println();
      }
    }
    sc.close();
  }
}

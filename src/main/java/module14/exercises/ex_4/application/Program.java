package module14.exercises.ex_4.application;

import module14.exercises.ex_4.entities.Stock;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char answer = 'y';
    Stock stock = new Stock("productName", 10);
    System.out.print(stock);

    while (answer == 'y') {
      try {
        System.out.print("How many product do you want to withdraw? ");
        stock.withdraw(sc.nextInt());
        sc.nextLine();
        System.out.print(stock);

      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());

      } catch (Exception e) {
        System.out.println("Something went wrong, please try again");

      } finally {
        System.out.print("Do you want to do it again? (y/n) ");
        answer = sc.next().charAt(0);
        if (answer != 'y') {
          System.out.println("Goodbye!");
        }
      }
    }
    sc.close();
  }
}

//Create a feature that receives a single word provided by the user and returns that word displayed as a confirmation message.

package module04.lesson26dataEntry.exercises.ex_1;

import java.util.Scanner;

public class DataEntryDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sc.next();
    System.out.printf("Nice to meet you %s!%n", name);

    sc.close();
  }
}

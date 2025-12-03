//Create a feature that receives a single character provided by the user and displays a message indicating which character was entered.

package module04.lesson26dataEntry.exercises.ex_4;

import java.util.Scanner;

public class DataEntryDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first character of your name:");
    char firstLetter = sc.next().charAt(0);
    System.out.printf("The first character of your name is %s.", firstLetter);

    sc.close();
  }
}

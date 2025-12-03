//Create a feature that receives a decimal number provided by the user and displays a message with that value formatted with two decimal places.

package module04.lesson26dataEntry.exercises.ex_3;

import java.util.Scanner;

public class DataEntryDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a decimal number: ");
    double number = sc.nextDouble();
    System.out.printf("The number you entered is: %.2f%n", number);

    sc.close();
  }
}

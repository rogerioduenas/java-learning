//Create a feature that receives an integer provided by the user and displays a message indicating the value received.

package module04.lesson26dataEntry.exercises.ex_2;

import java.util.Scanner;

public class DataEntryDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your age:");
    int age = sc.nextInt();
    System.out.printf("Your age is %d.%n", age);

    sc.close();
  }
}

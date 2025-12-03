//Create a feature that receives three values provided by the user—a word, an integer, and a decimal number—and displays a summary message containing the three values clearly identified.

package module04.lesson26dataEntry.exercises.ex_5;

import java.util.Scanner;

public class DataEntryDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sc.next();
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("Enter your salary: ");
    double salary = sc.nextDouble();

    System.out.printf("%s is %d years old and earns %.2f a month.\n", name, age, salary);

    sc.close();
  }
}

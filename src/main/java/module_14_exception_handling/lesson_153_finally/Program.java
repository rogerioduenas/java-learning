package module_14_exception_handling.lesson_153_finally;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();

      System.out.println("You entered: " + number);

    } catch (Exception e) {
      System.out.println("Invalid input");

    } finally {
      scanner.close(); // always executed
      System.out.println("Scanner closed");
    }
  }
}

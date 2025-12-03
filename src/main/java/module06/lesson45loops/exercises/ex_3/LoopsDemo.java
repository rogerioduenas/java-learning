// Create a feature that reads a numeric value provided by the user and repeatedly displays that value until a pre-defined termination condition is met, using an approach where the verification occurs before the repetitions.

package module06.lesson45loops.exercises.ex_3;

import java.util.Scanner;

public class LoopsDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int breakPoint = 5;

    while (num > breakPoint) {
      System.out.println(num);
      num--;
    }
  }
}

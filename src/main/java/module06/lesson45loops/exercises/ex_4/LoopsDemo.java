//Create a feature that prompts the user for a numeric value and displays it repeatedly while incrementing that value with each iteration, ensuring that at least one iteration is executed before the continuation condition is checked.

package module06.lesson45loops.exercises.ex_4;

import java.util.Scanner;

public class LoopsDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    do {
      System.out.println(num);
      num++;
    } while (num > 0 && num < 10);

    sc.close();
  }
}

//Create a feature that receives a numerical value provided by the user and displays a countdown on the screen, starting at a fixed initial limit and advancing until it reaches the value entered by the user, using a repetition structure suitable for this flow.
package module06.lesson45loops.exercises.ex_1;

import java.util.Scanner;

public class LoopsDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");
    int limit = 1;
    int num = sc.nextInt();

    for (int i = limit; i <= num; i++) {
      System.out.println(i);
    }

    sc.close();
  }
}

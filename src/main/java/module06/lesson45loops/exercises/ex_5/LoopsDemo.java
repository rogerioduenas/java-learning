//Create a feature that receives two numerical values from the user and displays all the numbers between them, advancing in steps defined by the program itself, repeating the operation until the entire range is traversed.

package module06.lesson45loops.exercises.ex_5;

import java.util.Scanner;

public class LoopsDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n1 = sc.nextInt();
    System.out.println("Enter a number greater than the previous one: ");
    int n2 = sc.nextInt();
    int betweenNumber = n1 + 1;

    while (betweenNumber < n2) {
      System.out.println(betweenNumber);
      betweenNumber++;
    }

    sc.close();
  }
}

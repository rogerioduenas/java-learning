/*Create a routine that receives two numeric values provided by the user, performing an arithmetic operation between them that requires converting one of the values to another numeric type before the calculation. The routine should return a final value already converted to the type most appropriate to the expected result.*/
package module04.lesson25casting.exercises.ex_1;

import java.util.Scanner;

public class CovertNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Integer: ");
    int integer = sc.nextInt();

    System.out.println("Enter Decimal: ");
    double decimal = sc.nextDouble();

    double result = (double) integer / decimal;

    System.out.println(result);

    sc.close();
  }

  ;
}

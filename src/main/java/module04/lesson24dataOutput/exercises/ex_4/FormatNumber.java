/*Implement a method that receives a monetary value (of type double) and displays it with 1, 2, and 3 decimal places.*/
package module04.lesson24dataOutput.exercises.ex_4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormatNumber {

  static void main(String[] args) {
    formatNumber(10.2837465);
  }

  static void formatNumber(double number) {

    BigDecimal bd = new BigDecimal(number);

    System.out.println(bd.setScale(1, RoundingMode.HALF_UP));
    System.out.println(bd.setScale(2, RoundingMode.HALF_UP));
    System.out.println(bd.setScale(3, RoundingMode.HALF_UP));
  }
}

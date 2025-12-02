/*Write a program that receives a double value and displays that value in at least three formats: standard, two decimal places, and currency format.*/
package module04.lesson24dataOutput.exercises.ex_6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class ShowData {
  double number;

  public ShowData(double number) {
    this.number = number;
  }

  static void main(String args[]) {
    ShowData number = new ShowData(495.03674578);
    number.showNumber();
  }

  void showNumber() {
    BigDecimal bd = BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP);
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    System.out.printf("Default: %f%n Decimal: %s%n Currency: %s%n",number, bd.toString(), nf.format(bd));
  }
}

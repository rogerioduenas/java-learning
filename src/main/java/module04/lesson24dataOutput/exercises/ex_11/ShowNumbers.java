/*Write a code that, upon receiving a value, automatically chooses the appropriate format:
int (without decimal places), decimal with two decimal places, or currency. Show an example of each case.*/

package module04.lesson24dataOutput.exercises.ex_11;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class ShowNumbers {

  static void main(String[] args) {
    double[] numbers = {5, 7.345, 1234.56};
    showData(numbers);
  }

  static void showData(double[] list) {
    for (double number : list) {

      if (number == Math.floor(number)) {
        System.out.printf("Integer: %d%n", (int) number);
      } else if (number < 1000) {
        BigDecimal bd = BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP);
        System.out.printf("Decimal: %.2f%n", bd.doubleValue());
      } else {
        BigDecimal bd = BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Currency: %s%n", nf.format(bd));
      }
    }
  }
}

/*Develop a program that generates a textual report containing multiple pieces of information
   (text, integers, decimals), applying consistent formatting and displaying everything
   in a single organized block.*/
package module04.lesson24dataOutput.exercises.ex_12;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class ReportGenerator {

  static void main(String[] args) {
    String[] names = {"Alice", "Bob", "Charlie"};
    int[] ages = {25, 30, 22};
    double[] salaries = {3500.5, 4200.75, 2800.0};

    generateReport(names, ages, salaries);
  }

  static void generateReport(String[] names, int[] ages, double[] salaries) {

    for (int i = 0; i < names.length; i++) {
      BigDecimal bdSalary = BigDecimal.valueOf(salaries[i]).setScale(2, RoundingMode.HALF_UP);
      NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

      System.out.printf(
          "Name: %s | Age: %d years | Salary: %s%n",
          names[i], ages[i], nf.format(bdSalary)
      );
    }

  }
}

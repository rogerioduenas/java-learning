/*Implement a code that changes the program's location and displays a decimal value before and after the change, highlighting the formatting difference.*/
package module04.lesson24dataOutput.exercises.ex_7;

import java.util.Locale;

public class ModifiesLocale {

  static void main(String[] args) {
    modifiesLocale(25.50);
  }

  static void modifiesLocale(double value) {
    Locale.setDefault(Locale.US);
    System.out.printf("US: %.2f%n", value);

    Locale.setDefault(Locale.of("pt", "BR"));
    System.out.printf("BR: %.2f%n", value);
  }
}

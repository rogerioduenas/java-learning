/*Declare a double variable and display its value in three different formats: default value, two decimal places, currency.*/

package module04.lesson24dataOutput.exercises.ex_1;

public class ShowNumbers {

  static void main() {

    double number = 35.83764;

    System.out.printf("Default value: %f%n", number);
    System.out.printf("Two decimal: %.2f%n", number);
    System.out.printf("Currency: $%.2f%n", number);
  }
}

/*Write code that displays, in a single line, text, an integer value, and a decimal value formatted to two decimal places.*/
package module_04_sequential_structures.lesson_31_data_output.exercises.ex_3;

public class ShowText {

  static void main(String[] args) {

    String text = "any text";
    int integerNumber = 35;
    double decimalNumber = 35.83764;

    System.out.printf("Text: %s - Integer: %d - Decimal: %.2f", text, integerNumber, decimalNumber);
  }
}

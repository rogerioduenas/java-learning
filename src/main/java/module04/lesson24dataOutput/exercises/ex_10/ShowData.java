/*Implement a method that receives text, integer, and decimal parameters, and assembles a final formatted message by combining all the values.*/
package module04.lesson24dataOutput.exercises.ex_10;

public class ShowData {


  static void main(String[] args) {
    showData("Any text", 21, 19.90);
  }

  static void showData(String text, int integer, double decimal) {
    System.out.printf("Text: %s - Integer: %d, Decimal: %.1f", text, integer, decimal);
  }
}

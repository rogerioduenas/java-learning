/*Write a program that receives a list of double values and displays them all using the same formatting rule (for example: two decimal places).*/
package module04.lesson24dataOutput.exercises.ex_9;

public class FormatListValues {

  static void main(String[] args) {
    double[] list = {23.3, 3456.2837, 10.5, 18.85};
    showListValues(list);
  }

  static void showListValues(double[] list) {
    for (double value : list) {
      System.out.printf("%.2f%n", value);
    }
  }
}
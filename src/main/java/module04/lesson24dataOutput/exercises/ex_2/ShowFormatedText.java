/*Write a program that forms and displays a sentence by combining a fixed text, an integer, and a decimal number formatted with two decimal places.*/
package module04.lesson24dataOutput.exercises.ex_2;

public class ShowFormatedText {

  static void main(String[] args) {

    String name = "Anna";
    int age = 31;
    double income = 4000.00;

    System.out.printf("%s is %d and earns $%.2f a month", name, age, income);
  }
}

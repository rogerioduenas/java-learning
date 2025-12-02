/*Create a class with the attributes name (String), age (int), and income (double). Then, display this data using numeric formatting to show the income with two decimal places.*/
package module04.lesson24dataOutput.exercises.ex_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreatePerson {

  String name;
  int age;
  double income;

  public CreatePerson(String name, int age, double income) {
    this.name = name;
    this.age = age;
    this.income = income;
  }

  static void main(String args[]) {
    CreatePerson person = new CreatePerson("John", 19, 4000.00);
    person.showData();
  }

  void showData() {
    BigDecimal bd = new BigDecimal(income).setScale(2, RoundingMode.HALF_UP);
    System.out.printf("%s is %d years old and earns $%.2f a month\n",
        name, age, bd.doubleValue());
  }
}

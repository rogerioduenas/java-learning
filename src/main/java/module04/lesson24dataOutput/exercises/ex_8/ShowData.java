/*Develop a program that displays, in a single final string: a text, an integer, and a decimal number formatted with two decimal places of precision.*/

package module04.lesson24dataOutput.exercises.ex_8;

public class ShowData {

  String name;
  int age;
  double height;

  public ShowData(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  static void main(String args[]) {
    ShowData person = new ShowData("Samuel", 19, 1.88);
    person.showData();
  }

  void showData() {
    System.out.printf("%s is %d years old and is %.2f meters tall", name, age, height);
  }
}

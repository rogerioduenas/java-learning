//Create a component that receives two numeric values of different types, performs an operation between them by applying explicit conversion to at least one of the values, and displays the converted result in a way that is consistent with the calculation.

package module04.lesson25casting.exercises.ex_3;

public class CastDemo {

  public static void main(String[] args) {
    method1(10, 2.50);
  }

  static void method1(int n1, double n2) {
    int result = n1 - (int) n2;
    System.out.println(result);
  }
}

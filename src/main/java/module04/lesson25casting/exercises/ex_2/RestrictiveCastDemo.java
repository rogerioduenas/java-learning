/*Create a procedure that receives a single numeric value of a broader type and produces an output representing that value converted to a more restricted type, ensuring that the output describes the value after the conversion.*/
package module04.lesson25casting.exercises.ex_2;

public class RestrictiveCastDemo {

  public static void main(String[] args) {

    convertDoubleToInt(230.098457);
  }

  static void convertDoubleToInt(double number) {
    int convertedNumber = (int) number;
    System.out.println(convertedNumber);
  }
}

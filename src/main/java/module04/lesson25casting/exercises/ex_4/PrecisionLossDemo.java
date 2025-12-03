//Create an operation that receives a numeric value representing a measurement and outputs that same measurement converted to another numeric type, demonstrating the change in precision caused by the conversion.

package module04.lesson25casting.exercises.ex_4;

public class PrecisionLossDemo {

  public static void main(String[] args) {
    double centimetersAndMilimeters = 25.28;
    int centimeters = (int) centimetersAndMilimeters;

    System.out.println(centimeters);
  }
}

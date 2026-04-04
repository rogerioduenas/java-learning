//Create a function that receives three numeric values of different types — a byte, an int, and a double. The function should add the byte to the int, convert the double to an int using explicit casting, and then multiply the two results. Finally, convert the final result to a double before returning.

package module_04_sequential_structures.lesson_32_casting.exercises.ex_5;

public class MixedTypeCastingDemo {

  public static void main(String[] args) {
    byte byteValue = 5;
    int intValue = 120;
    double doubleValue = 2.75;

    int byteValuePlusIntValue = byteValue + intValue;
    int convertedDoubleValue = (int) doubleValue;
    int result = byteValuePlusIntValue * convertedDoubleValue;
    System.out.println((double) result);
  }
}

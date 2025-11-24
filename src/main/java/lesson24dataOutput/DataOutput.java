package lesson24dataOutput;

import java.util.Locale;

public class DataOutput {
  static void main() {

    double price = 10.35878;
    System.out.println(price);
    System.out.printf("%.2f\n", price);
    System.out.printf("%.4f\n", price);
    Locale.setDefault(Locale.US);
    System.out.println("Result = $" + price + " dollars!");
    System.out.printf("Result = $%.2f dollars!\n", price);

    String name = "Anna";
    int age = 31;
    double income = 4000.00;
    System.out.printf("%s is %d years old and has an income of $%.2f", name, age, income);
  }
}

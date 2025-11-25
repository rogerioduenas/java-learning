package lesson44debug;

import java.util.Scanner;

public class Debug {

  static void main() {

    Scanner sc = new Scanner(System.in);

    double width = sc.nextDouble();
    double length = sc.nextDouble();
    double priceSquareMeter = sc.nextDouble();

    double area = width * length;
    double totalPrice = area * priceSquareMeter;

    System.out.printf("The area is: %.2f%n", area);
    System.out.printf("The total price is: %.2f%n", totalPrice);

    sc.close();
  }
}

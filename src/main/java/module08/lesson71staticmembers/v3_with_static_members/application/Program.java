package module08.lesson71staticmembers.v3_with_static_members.application;

import module08.lesson71staticmembers.v3_with_static_members.util.Calculator;

import java.util.Scanner;

public class Program {

  static void main(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter radius");
    double radius = sc.nextDouble();

    double c = Calculator.circumference(radius);

    double v = Calculator.volume(radius);

    System.out.printf("Circumference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", Calculator.PI);

    sc.close();
  }
}

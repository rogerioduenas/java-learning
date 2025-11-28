package module08.lesson64withoutandwithoop.with;

import module08.lesson64withoutandwithoop.with.entities.Triangle;

import java.util.Scanner;

public class Program {

  static void main(){
    Scanner sc = new Scanner(System.in);
    Triangle x = new Triangle();
    Triangle y = new Triangle();

    System.out.println("Enter the measures of triangle X");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Enter the measures of triangle X");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();
    double areaY = y.area();

    System.out.printf("Area of triangle X is %.2f\n", areaX);
    System.out.printf("Area of triangle Y is %.2f\n", areaY);

    if (areaX > areaY) {
      System.out.printf("Larger area is X: %.2f\n", areaX);
    } else {
      System.out.printf("Larger area is Y: %.2f\n", areaY);
    }

    sc.close();
  }
}

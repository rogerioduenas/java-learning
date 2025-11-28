package module08.lesson64withoutandwithoop.without;

import java.util.Scanner;

public class Without {

  static void main() {
    Scanner sc = new Scanner(System.in);
    double xA, xB, xC, yA, yB, yC;
    System.out.println("Enter the measures of triangle X");
    xA = sc.nextDouble();
    xB = sc.nextDouble();
    xC = sc.nextDouble();
    System.out.println("Enter the measures of triangle X");
    yA = sc.nextDouble();
    yB = sc.nextDouble();
    yC = sc.nextDouble();

    double p = (xA + xB + xC) / 2;
    double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

    p = (yA + yB + yC) / 2;
    double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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

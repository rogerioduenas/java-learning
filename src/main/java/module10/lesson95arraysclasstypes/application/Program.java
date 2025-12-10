package module10.lesson95arraysclasstypes.application;

import module10.lesson95arraysclasstypes.entities.Product;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Product[] vect = new Product[n];

    for (int i = 0; i < vect.length; i++) {
      sc.nextLine();
      String name = sc.nextLine();
      double price = sc.nextDouble();
      vect[i] = new Product(name, price);
    }

    double sum = 0.0;
    for (int i = 0; i < vect.length; i++) {
      sum += vect[i].getPrice();
    }
    double average = sum / vect.length;
    System.out.printf("Average price: %.2f", average);

    sc.close();
  }
}

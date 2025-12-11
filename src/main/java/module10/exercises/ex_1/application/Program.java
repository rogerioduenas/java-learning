package module10.exercises.ex_1.application;

import module10.exercises.ex_1.entities.Product;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter quantity of products you want to add: ");
    int n = sc.nextInt();
    Product[] products = new Product[n];

    for (int i = 0; i < products.length; i++) {
      sc.nextLine();
      System.out.println("----- Enter product data -----");
      System.out.println("Name: ");
      String name = sc.nextLine();
      System.out.println("Price: ");
      double price = sc.nextDouble();
      System.out.println("Quantity: ");
      int quantity = sc.nextInt();

      products[i] = new Product(name, price, quantity);
    }

    double totalStock = 0;
    for (Product product : products) {
      totalStock += product.totalValue();
      System.out.println(product);
    }

    System.out.printf("Total value in stock: %.2f%n", totalStock);

    sc.close();
  }
}

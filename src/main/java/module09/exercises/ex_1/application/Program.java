package module09.exercises.ex_1.application;

import module09.exercises.ex_1.entities.Product;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name of product:");
    String name = sc.nextLine();

    System.out.println("Enter price of product:");
    double price = sc.nextDouble();

    Product product = new Product(name, price);

    System.out.println(product);

    System.out.println("Enter quantity of product to add:");
    int quantity = sc.nextInt();
    product.addProducts(quantity);
    System.out.println(product);

    System.out.println("Enter quantity of product to remove:");
    int quantityToRemove = sc.nextInt();
    product.removeProducts(quantityToRemove);

    System.out.printf("Updated product: %s%n", product);

    sc.close();
  }
}

package module09.lesson84encapsulation.application;

import module09.lesson84encapsulation.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Price: ");
    double price = sc.nextDouble();

    Product product = new Product(name, price);

    product.setName("Computer");
    System.out.printf("Updated name: %s%n", product.getName());

    product.setPrice(500.00);
    System.out.printf("Updated price: %.2f%n", product.getPrice());

    System.out.printf("Quantity: %d%n", product.getQuantity());

    System.out.println();
    System.out.println("Product data: " + product);
    System.out.println();

    System.out.print("Enter the number of products to be added in stock: ");
    int quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);
    System.out.println();

    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    sc.close();
  }
}
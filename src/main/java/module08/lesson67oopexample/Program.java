package module08.lesson67oopexample;

import module08.lesson67oopexample.entities.Product;

import java.util.Scanner;

public class Program {

  public static void main() {
    Scanner sc = new Scanner(System.in);
    Product product = new Product();

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = sc.nextLine();
    System.out.print("Price: ");
    product.price = sc.nextDouble();
    System.out.print("Quantity: ");
    product.quantity = sc.nextInt();

    System.out.println();
    System.out.printf("Product data: %s\n", product);

    //add
    System.out.println();
    System.out.println("Enter the number of products to be added in stock: ");
    int quantityToAdd = sc.nextInt();
    product.addProducts(quantityToAdd);

    System.out.println();
    System.out.printf("Updated product data: %s\n", product);
    System.out.println();

    //remove
    System.out.println();
    System.out.println("Enter the number of products to be removed in stock: ");
    int quantityToRemove = sc.nextInt();
    product.removeProducts(quantityToRemove);

    System.out.println();
    System.out.printf("Updated product data: %s\n", product);
    System.out.println();

    sc.close();
  }
}

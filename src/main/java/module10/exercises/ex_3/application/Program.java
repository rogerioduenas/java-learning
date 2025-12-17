package module10.exercises.ex_3.application;

import module10.exercises.ex_3.entities.Product;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Product[] listOfProducts = createProducts(sc);
    findProduct(sc, listOfProducts);

    sc.close();
  }

  public static Product[] createProducts(Scanner sc) {
    System.out.println("Enter quantity of products to register: ");
    int quantity = sc.nextInt();
    sc.nextLine();
    Product[] products = new Product[quantity];

    for (int i = 0; i < quantity; i++) {
      System.out.printf("Product: %d%n", i + 1);
      System.out.println("Name: ");
      String name = sc.nextLine();
      System.out.println("Price: ");
      double price = sc.nextDouble();
      System.out.println("Quantity: ");
      int quantityInStock = sc.nextInt();
      sc.nextLine();
      products[i] = new Product(name, price, quantityInStock);
    }

    return products;
  }

  public static void findProduct(Scanner sc, Product[] products) {
    System.out.println("Enter product name: ");
    String name = sc.nextLine();

    boolean found = false;

    for (int i = 0; i < products.length; i++) {
      if (products[i].getName().equalsIgnoreCase(name)) {
        System.out.printf("Product infos: %s%n", products[i]);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Product not found.");
    }
  }
}

package module14.exercises.ex_1.application;

import module14.exercises.ex_1.entities.Order;
import module14.exercises.ex_1.entities.OrderItem;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Order order = new Order();
    char isAdd;

    System.out.println("----- Order -----");
    System.out.print("Do you want to add an item to the order? (y/n): ");
    isAdd = sc.next().charAt(0);
    sc.nextLine();

    if (isAdd == 'y') {
      do {
        try {
          System.out.print("Enter the item name: ");
          String itemName = sc.nextLine();

          System.out.print("Enter the item quantity: ");
          int quantity = sc.nextInt();

          System.out.print("Enter the item price: ");
          double price = sc.nextDouble();
          sc.nextLine();

          order.addItem(new OrderItem(itemName, quantity, price));
          System.out.println("Item added successfully!");

        } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());
        } catch (Exception e) {
          System.out.println("Unexpected error: Please ensure you enter the values in the correct formats.");
          sc.nextLine();
        } finally {
          System.out.print("Do you want to add another item? (y/n): ");
          isAdd = sc.next().toLowerCase().charAt(0);
          sc.nextLine();
        }
      } while (isAdd == 'y');
    }

    System.out.println(order);
    sc.close();
  }
}

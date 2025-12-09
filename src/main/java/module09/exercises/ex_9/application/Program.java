package module09.exercises.ex_9.application;

import module09.exercises.ex_9.entities.InventoryItem;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    InventoryItem newItem = new InventoryItem();

    System.out.println("----- Enter the data to create a new product in the inventory -----");
    System.out.println("Enter the name of the item: ");
    newItem.setName(sc.nextLine());
    System.out.println("Enter the price of the item: ");
    newItem.setUnitPrice(sc.nextDouble());
    System.out.println("Enter the quantity of the item: ");
    newItem.setQuantity(sc.nextInt());

    System.out.println(newItem);

    System.out.println("Enter the quantity of items you want to add to the inventory. ");
    newItem.increase(sc.nextInt());
    System.out.println(newItem);

    System.out.println("Enter the quantity of items you want to remove to the inventory. ");
    newItem.decrease(sc.nextInt());
    System.out.println(newItem);




    sc.close();
  }
}

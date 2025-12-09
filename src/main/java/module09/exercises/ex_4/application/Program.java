package module09.exercises.ex_4.application;

import module09.exercises.ex_4.entities.Medicine;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Medicine medicine = new Medicine();

    System.out.println("Enter medicine name: ");
    medicine.setName(sc.nextLine());

    System.out.println("Enter medicine price: ");
    medicine.setPrice(sc.nextDouble());

    System.out.println(medicine);

    System.out.println("Enter medicine to add: ");
    medicine.addStock(sc.nextInt());
    System.out.println(medicine);

    System.out.println("Enter medicine to remove: ");
    int toRemove = sc.nextInt();
    medicine.removeStock(toRemove);
    System.out.println(medicine);

    sc.close();
  }
}

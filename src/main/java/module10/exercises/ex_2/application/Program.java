package module10.exercises.ex_2.application;

import module10.exercises.ex_2.entities.Rent;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Rent[] rooms = new Rent[10];

    System.out.print("How many students will rent rooms? ");
    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      System.out.println();
      System.out.println("Rent #" + (i + 1));

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Email: ");
      String email = sc.nextLine();

      int room;
      while (true) {
        System.out.print("Room (0 to 9): ");
        room = sc.nextInt();
        sc.nextLine();

        if (rooms[room] == null) {
          rooms[room] = new Rent(name, email);
          break;
        } else {
          System.out.println("Room already occupied. Try another.");
        }
      }
    }

    System.out.println();
    System.out.println("Occupied rooms:");
    for (int i = 0; i < rooms.length; i++) {
      if (rooms[i] != null) {
        System.out.println(i + ": " + rooms[i]);
      }
    }

    sc.close();
  }
}

package module10.exercises.ex_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> listNames = new ArrayList<>();
    List<String> filteredList = new ArrayList<>();

    System.out.println("Enter quantity of names to add: ");
    int quantity = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < quantity; i++) {
      System.out.printf("Enter name %d:%n", i + 1);
      String name = sc.nextLine();
      listNames.add(name);
    }

    System.out.println("Enter letter to filter list of names: ");
    Character letter = sc.next().charAt(0);
    filterByInitial(letter, listNames, filteredList);

    System.out.println(filteredList);
    sc.close();
  }

  public static void filterByInitial(Character initial, List<String> list, List<String> result) {
    for (String name : list) {
      if (name.charAt(0) == initial) {
        result.add(name);
      }
    }
  }
}

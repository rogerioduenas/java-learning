package module10.exercises.ex_7.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> tasks = new ArrayList<>();
    boolean removed = false;

    System.out.println("Enter number of tasks: ");
    int numbersOfTasks = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < numbersOfTasks; i++) {
      System.out.printf("Enter task name %d: ", i + 1);
      addTask(sc.nextLine(), tasks);
    }

    while (!removed) {
      System.out.println("Enter the task name to remove: ");
      removed = removeByName(sc.nextLine(), tasks);
    }

    if (!tasks.isEmpty()) {
      removed = false;
      while (!removed) {
        System.out.println("Enter the task index to remove: ");
        removed = removeByIndex(sc.nextInt(), tasks);
        sc.nextLine();
      }
    }

    listAll(tasks);

    sc.close();
  }

  public static void addTask(String task, List<String> list) {
    list.add(task);
    System.out.println("Size: " + list.size());
  }

  public static boolean removeByName(String task, List<String> list) {
    if (list.contains(task)) {
      list.remove(task);
      System.out.println("Size: " + list.size());
      return true;
    }
    System.out.println("Not found: " + task);
    return false;
  }


  public static boolean removeByIndex(int index, List<String> list) {
    if (index >= 0 && index < list.size()) {
      list.remove(index);
      System.out.println("Size: " + list.size());
      return true;
    }
    System.out.println("Index not found: " + index);
    return false;

  }

  public static void listAll(List<String> list) {
    System.out.println(list);
  }
}
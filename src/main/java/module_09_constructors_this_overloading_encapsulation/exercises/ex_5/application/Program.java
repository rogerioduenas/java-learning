package module_09_constructors_this_overloading_encapsulation.exercises.ex_5.application;

import module_09_constructors_this_overloading_encapsulation.exercises.ex_5.entities.Book;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter ISBN: ");
    String isbn = sc.nextLine();
    System.out.println("Enter Title: ");
    String title = sc.nextLine();
    System.out.println("Enter Price: ");
    double price = sc.nextDouble();

    Book book = new Book(isbn, title, price);
    System.out.println(book);

    sc.close();
  }
}

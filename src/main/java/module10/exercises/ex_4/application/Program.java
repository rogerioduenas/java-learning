package module10.exercises.ex_4.application;

import module10.exercises.ex_4.entities.Grade;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students you want to add: ");
    int quantity = sc.nextInt();
    sc.nextLine();
    if (quantity <= 0) {
      System.out.println("Please enter a positive integer");
      sc.close();
      return;
    }
    Grade[] grades = new Grade[quantity];

    for (int i = 0; i < grades.length; i++) {
      System.out.printf("Student: %d%n", i + 1);
      System.out.println("--------------------");
      System.out.printf("Enter grade 1:%n");
      Double grade1 = sc.nextDouble();
      System.out.printf("Enter grade 2:%n");
      Double grade2 = sc.nextDouble();

      Grade grade = new Grade(grade1, grade2);
      grades[i] = grade;
    }

    System.out.println(calculateMinMaxAndAverage(grades));
    sc.close();
  }

  public static String calculateMinMaxAndAverage(Grade[] grades) {

    Double[] first = grades[0].getValue();
    Double largest = first[0];
    Double smallest = first[0];
    Double total = 0.0;
    int count = 0;

    for (Grade grade : grades) {
      for (Double value : grade.getValue()) {

        if (value > largest) largest = value;
        if (value < smallest) smallest = value;

        total += value;
        count++;
      }
    }

    Double average = total / count;

    return String.format(
        "Largest: %.2f | Smallest: %.2f | Average: %.2f%n",
        largest, smallest, average
    );
  }
}

package module09.exercises.ex_3.application;

import module09.exercises.ex_3.entities.Student;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Student student1 = new Student("Mike", 8.5);
    Student student2 = new Student("Anna");
    Student student3 = new Student();

    System.out.printf("Student 1: %s\n", student1);
    System.out.printf("Student 2: %s\n", student2);
    System.out.printf("Student 3: %s\n", student3);

    student1.updateScore(0);
    System.out.printf("Student 1 updated: %s\n", student1);
  }
}

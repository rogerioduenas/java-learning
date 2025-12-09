package module09.exercises.ex_10.application;

import module09.exercises.ex_10.entities.AcademicRecord;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    System.out.println(" ----- Example 1 -----");
    AcademicRecord student = new AcademicRecord("Mike", 12345, 7.5);
    System.out.println(student);
    student.setGpa(10);
    System.out.println(student);

    System.out.println(" ----- Example 2 -----");
    AcademicRecord student2 = new AcademicRecord("Mike", 12345);
    student2.setGpa(7);
    System.out.println(student2);

    System.out.println(" ----- Example 3 -----");
    AcademicRecord student3 = new AcademicRecord();
    student3.setGpa(5);
    System.out.println(student3);
  }
}

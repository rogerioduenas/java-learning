package module18.exercises.ex_3;

import module18.exercises.ex_3.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Student> students = new ArrayList<>(Arrays.asList(
        new Student("Bella Swan", "Biology", 1000.00),
        new Student("Alex Murphy", "Computer Science", 2000.00),
        new Student("Dana Scully", "Medicine", 3000.00)
    ));

    Double percentage = 10.0;
    students.forEach(p -> p.updateFee(percentage));

    students.forEach(System.out::println);
  }
}

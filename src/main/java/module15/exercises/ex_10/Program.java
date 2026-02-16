package module15.exercises.ex_10;

import module15.exercises.ex_10.model.RequiredFile;
import module15.exercises.ex_10.service.FileValidationService;

import java.util.List;

public class Program {

  public static void main(String[] args) {
    List<RequiredFile> requirements = List.of(
        new RequiredFile("src/main/java/module15/exercises/ex_10/required/schema.txt"),
        new RequiredFile("src/main/java/module15/exercises/ex_10/required/security.txt"),
        new RequiredFile("src/main/java/module15/exercises/ex_10/required/settings.txt")
    );

    try {
      FileValidationService.validateExistence(requirements);
      System.out.println("Starting the system services...");
    } catch (RuntimeException e) {
      System.err.println(e.getMessage());
    }
  }
}

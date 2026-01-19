package module11.exercises.ex_7.application;

import module11.exercises.ex_7.entities.DateTimeInputService;

import java.time.LocalDateTime;

public class Program {
  public static void main(String[] args) {
    LocalDateTime result = DateTimeInputService.convertStringToDateTime("20/12/2025 18:30");
    System.out.println(result);
  }
}

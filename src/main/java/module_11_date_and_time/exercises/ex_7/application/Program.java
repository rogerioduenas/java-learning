package module_11_date_and_time.exercises.ex_7.application;

import module_11_date_and_time.exercises.ex_7.entities.DateTimeInputService;

import java.time.LocalDateTime;

public class Program {
  public static void main(String[] args) {
    LocalDateTime result = DateTimeInputService.convertStringToDateTime("20/12/2025 18:30");
    System.out.println(result);
  }
}

package module11.exercises.ex_4.application;

import module11.exercises.ex_4.entities.DateConverter;

import java.time.Instant;
import java.time.LocalDate;

public class Program {

  public static void main(String[] args) {
    LocalDate localDate = DateConverter.instantToLocalDate(Instant.now());
    System.out.println(localDate);
  }
}

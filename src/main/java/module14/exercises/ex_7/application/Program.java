package module14.exercises.ex_7.application;

import module14.exercises.ex_7.services.RentalService;

import java.time.LocalDate;

public class Program {
  public static void main(String[] args) {
    RentalService service = new RentalService();

    try {
      System.out.println("--- Attempting Rental ---");
//      service.rent("1", LocalDate.now(), LocalDate.now().plusDays(5));
      service.rent("1", LocalDate.now().plusDays(5), LocalDate.now());
    } catch (Exception e) {
      System.out.println("User Message: " + e.getMessage());
    }

    System.out.println("\nFinal State Check:");
    System.out.println(service);
  }
}

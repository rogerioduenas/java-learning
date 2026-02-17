package module16.lesson175interface.application;

import module16.lesson175interface.model.entities.CarRental;
import module16.lesson175interface.model.entities.Vehicle;
import module16.lesson175interface.model.services.BrTaxService;
import module16.lesson175interface.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
  public static void main(String[] args) {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDateTime start = LocalDateTime.parse("17/02/2026 10:30", fmt);
    LocalDateTime finish = LocalDateTime.parse("17/02/2026 14:40", fmt);

    CarRental cr = new CarRental(start, finish, new Vehicle("Civic"));

    RentalService rentalService = new RentalService(130.0, 10.0, new BrTaxService());
    rentalService.processInvoice(cr);

    System.out.println("===== INVOICE =====");
    System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
    System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
    System.out.println("Full payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

  }
}

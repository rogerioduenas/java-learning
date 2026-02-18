package module16.exercises.ex_1;


import module16.exercises.ex_1.model.CarRental;
import module16.exercises.ex_1.model.Vehicle;
import module16.exercises.ex_1.services.BrazilTaxService;
import module16.exercises.ex_1.services.RentalService;
import module16.exercises.ex_1.services.UsaTaxService;

import java.time.LocalDate;

public class Program {
  public static void main(String[] args) {
    LocalDate start = LocalDate.now();
    LocalDate finish = start.plusDays(10);

    CarRental carRental = new CarRental(start, finish, new Vehicle("Civic"));

    UsaTaxService usa = new UsaTaxService(); // tax 10%
    BrazilTaxService br = new BrazilTaxService(); // tax 20%
    RentalService rentalService = new RentalService(50.0, usa);
    rentalService.processingInvoice(carRental);

    System.out.println("===== INVOICE =====");
    System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
    System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTotalTax()));
    System.out.println("Full payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
  }
}

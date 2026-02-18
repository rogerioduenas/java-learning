package module16.exercises.ex_1.services;

import module16.exercises.ex_1.model.CarRental;
import module16.exercises.ex_1.model.Invoice;

import java.time.Period;


public class RentalService {

  private double pricePerDay;
  private TaxService taxService;

  public RentalService(double pricePerDay, TaxService taxService) {
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }

  public void processingInvoice(CarRental carRental) {
    int days = Period.between(carRental.getStart(), carRental.getFinish()).getDays();
    double basePayment = days * pricePerDay;
    double tax = taxService.calculateTax(basePayment);
    carRental.setInvoice(new Invoice(basePayment, tax));
  }
}

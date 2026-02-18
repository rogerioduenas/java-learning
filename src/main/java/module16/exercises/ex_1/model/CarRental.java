package module16.exercises.ex_1.model;

import java.time.LocalDate;

public class CarRental {
  private final LocalDate start;
  private final LocalDate finish;
  private Vehicle vehicle;
  private Invoice invoice;

  public CarRental(LocalDate start, LocalDate finish, Vehicle vehicle) {
    this.start = start;
    this.finish = finish;
    this.vehicle = vehicle;
  }

  public LocalDate getStart() {
    return start;
  }

  public LocalDate getFinish() {
    return finish;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }
}

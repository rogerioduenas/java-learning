package module14.exercises.ex_7.domain.entities;

import java.time.LocalDate;

public class Rental {

  private Car car;
  private LocalDate startDate;
  private LocalDate endDate;

  public Rental(Car car, LocalDate startDate, LocalDate endDate) {
    this.car = car;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public Car getCar() {
    return car;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  @Override
  public String toString() {
    return "Rental{" +
        "car=" + car +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        '}';
  }
}

package module14.exercises.ex_5.domain.entities;

import module14.exercises.ex_5.domain.domain.exception.DomainException;

import java.time.LocalDate;

public class Reservation {

  private final String resourceName;
  private LocalDate startDate;
  private LocalDate endDate;

  public Reservation(String resourceName, LocalDate startDate, LocalDate endDate) {
    validateDates(startDate, endDate);
    this.resourceName = resourceName;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public void updatePeriod(LocalDate startDate, LocalDate endDate) {
    validateDates(startDate, endDate);
    this.startDate = startDate;
    this.endDate = endDate;
  }

  private void validateDates(LocalDate startDate, LocalDate endDate) {
    if (!startDate.isBefore(endDate)) {
      throw new DomainException("Start date must be before end date");
    }
  }

  @Override
  public String toString() {
    return String.format("%s - %s - %s", this.resourceName, this.startDate, this.endDate);
  }
}

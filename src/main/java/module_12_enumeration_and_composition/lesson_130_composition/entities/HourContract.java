package module_12_enumeration_and_composition.lesson_130_composition.entities;

import java.time.LocalDate;

public class HourContract {
  private LocalDate date;
  private Double valuePerHour;
  private Integer hours;

  public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
    this.date = date;
    this.valuePerHour = valuePerHour;
    this.hours = hours;
  }

  public LocalDate getDate() {
    return date;
  }

  public Double totalValue() {
    return valuePerHour * hours;
  }
}

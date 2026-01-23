package module12.exercises.ex_9.entities;

import java.time.LocalDate;

public class Contract {
  private LocalDate date;
  private Double valuePerHour;
  private Integer hours;

  public Contract(LocalDate date, Double valuePerHour, Integer hours) {
    this.date = date;
    this.valuePerHour = valuePerHour;
    this.hours = hours;
  }

  public LocalDate getDate() {
    return date;
  }

  public Double getTotalValue() {
    return valuePerHour * hours;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Date: ").append(this.date).append(" - ");
    sb.append("Value: ").append(this.valuePerHour).append(" - ");
    sb.append("Hours: ").append(this.hours);
    return sb.toString();
  }
}

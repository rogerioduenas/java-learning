package module20.exercises.ex_7.model.entities;

import java.time.LocalDate;

public class Contract {

  private Long id;
  private String clientName;
  private Double value;
  private LocalDate date;

  public Contract(Long id, String clientName, Double value, LocalDate date) {
    this.id = id;
    this.clientName = clientName;
    this.value = value;
    this.date = date;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getClientName() {
    return clientName;
  }

  public Double getValue() {
    return value;
  }

  public LocalDate getDate() {
    return date;
  }

  @Override
  public String toString() {
    return String.format("%d - %s - %.2f - %tF", id, clientName, value, date);
  }

}

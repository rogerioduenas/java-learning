package module20.exercises.ex_9.model.entities;

import java.time.LocalDate;

public class Payment {

  private Long id;
  private Double amount;
  private PaymentMethod method;
  private LocalDate date;

  public Payment(Long id, Double amount, PaymentMethod method, LocalDate date) {
    this.id = id;
    this.amount = amount;
    this.method = method;
    this.date = date;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getAmount() {
    return amount;
  }

  public PaymentMethod getMethod() {
    return method;
  }

  public LocalDate getDate() {
    return date;
  }

  @Override
  public String toString() {
    return String.format("%d - %.2f - %s - %s", id, amount, method, date);
  }
}

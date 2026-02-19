package module16.exercises.ex_2.model;

import java.time.LocalDate;

public class Installment {

  private LocalDate dueDate;
  private double amount;

  public Installment(LocalDate dueDate, double amount) {
    this.dueDate = dueDate;
    this.amount = amount;
  }

  @Override
  public String toString() {
    return String.format("Due date: %s $%.2f", dueDate, amount);
  }
}

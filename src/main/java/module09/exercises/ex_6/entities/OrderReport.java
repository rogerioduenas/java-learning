package module09.exercises.ex_6.entities;

public class OrderReport {
  public void print(Order order) {
    System.out.printf("id: %d - total: %.2f%n", order.getId(), order.getTotalValue());
  }
}
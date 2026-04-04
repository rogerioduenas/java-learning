package module_09_constructors_this_overloading_encapsulation.exercises.ex_6.entities;

public class OrderReport {
  public void print(Order order) {
    System.out.printf("id: %d - total: %.2f%n", order.getId(), order.getTotalValue());
  }
}
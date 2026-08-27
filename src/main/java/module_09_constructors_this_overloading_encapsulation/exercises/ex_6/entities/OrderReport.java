package module_09_constructors_this_overloading_encapsulation.exercises.ex_6.entities;

import utils.Validate;

public class OrderReport {
  public String print(Order order) {
    Validate.notNull(order, "Order cannot be null");
    return String.format("id: %d - total: %.2f%n", order.getId(), order.getTotalValue());
  }
}
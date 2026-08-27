package module_09_constructors_this_overloading_encapsulation.exercises.ex_6.entities;

import utils.Validate;

public class Order {
  private final int id;
  private final double totalValue;

  public Order(int id, double totalValue) {
    Validate.positive(id, "Order ID must be positive");
    Validate.positive(totalValue, "Total value must be positive");
    this.id = id;
    this.totalValue = totalValue;
  }

  public int getId() {
    return id;
  }

  public double getTotalValue() {
    return totalValue;
  }

  public String generateReport() {
    return new OrderReport().print(this);
  }
}

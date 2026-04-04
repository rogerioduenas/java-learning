package module_17_generics_set_map.execises.ex_20.model;

public class Order {
  private Customer customer;
  private Double amount;

  public Order(Customer customer, Double amount) {
    this.customer = customer;
    this.amount = amount;
  }

  @Override
  public String toString() {
    return String.format("%s, amount: %.2f", customer, amount);
  }
}

package module_20_JDBC.exercises.ex_10.model.entities;

import module_12_enumeration_and_composition.exercises.ex_10.entities.OrderStatus;

public class Order {

  private Long id;
  private OrderStatus status;
  private Double total;

  private Client client;

  public Order(Long id, OrderStatus status, Double total, Client client) {
    this.id = id;
    this.status = status;
    this.total = total;
    this.client = client;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public Double getTotal() {
    return total;
  }

  public Client getClient() {
    return client;
  }

  @Override
  public String toString() {
    return String.format("%d - %s - %.2f - %s", id, status, total, client);
  }
}

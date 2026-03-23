package module20.exercises.ex_3.model;

public class Order {

  private Long id;
  private String clientName;
  private Double total;

  public Order(Long id, String clientName, Double total) {
    this.id = id;
    this.clientName = clientName;
    this.total = total;
  }

  public Long getId() {
    return id;
  }

  public String getClientName() {
    return clientName;
  }

  public Double getTotal() {
    return total;
  }

  @Override
  public String toString() {
    return String.format("ID: %s, Client: %s, Total: %s", id, clientName, total);
  }
}

package module14.exercises.ex_10.domain.entities;

public class Order {

  private int id;
  private final OrderStatus orderStatus;

  public Order(int id, OrderStatus orderStatus) {
    this.id = id;
    this.orderStatus = orderStatus;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  @Override
  public String toString() {
    return String.format("Id: %d, Status: %s", id, orderStatus);
  }
}

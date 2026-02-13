package module15.exercises.ex_5.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

  private String orderId;

  private List<OrderItem> items = new ArrayList<>();

  public Order(String orderId) {
    this.orderId = orderId;
  }

  public String getOrderId() {
    return orderId;
  }

  public double getTotalOrderPrice() {
    double total = 0;
    for (OrderItem item : items) {
      total += item.getTotalPrice();
    }
    return total;
  }

  public void addItem(OrderItem orderItem) {
    items.add(orderItem);
  }

  @Override
  public String toString() {
    return String.format("OrderId: %s, Items: %s", orderId, items);
  }
}

package module12.exercises.ex_7.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
  private LocalDateTime moment;
  private List<OrderItem> items = new ArrayList<>();

  public Order() {
    this.moment = LocalDateTime.now();
  }

  public void addItem(OrderItem item) {
    this.items.add(item);
  }

  public double totalOrderPrice() {
    double total = 0;
    for (OrderItem item : this.items) {
      total += item.getSubTotal();
    }
    return total;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: ").append(moment).append("\n");
    for (OrderItem item : items) {
      sb.append(item).append("\n");
    }
    sb.append("Total: ").append(totalOrderPrice());
    return sb.toString();
  }
}

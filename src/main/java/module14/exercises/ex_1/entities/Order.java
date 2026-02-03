package module14.exercises.ex_1.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {

  List<OrderItem> items = new ArrayList<>();

  public void addItem(OrderItem item) {
    this.items.add(item);
  }

  public Double getTotal() {
    Double total = 0.0;
    for (OrderItem item : this.items) {
      total += item.getTotal();
    }
    return total;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n----- ORDER SUMMARY -----\n");
    for (OrderItem item : items) {
      sb.append(item.toString()).append("\n");
    }
    sb.append("-------------------------\n");
    sb.append(String.format("TOTAL ORDER: $%.2f", getTotal()));
    return sb.toString();
  }
}

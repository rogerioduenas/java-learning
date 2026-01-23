package module12.exercises.ex_8.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
  private LocalDateTime moment;
  private OrderStatus status;
  private Client client;

  private List<OrderItem> items = new ArrayList<>();

  public Order(OrderStatus status, Client client) {
    this.moment = LocalDateTime.now();
    this.status = status;
    this.client = client;
  }

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

  public void addItem(OrderItem item) {
    this.items.add(item);
  }

  public double getTotal() {
    double total = 0;
    for (OrderItem item : items) {
      total += item.getTotal();
    }
    return total;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("----- Order Sumary -----").append("\n");
    sb.append("Date: ").append(this.moment.format(formatter)).append("\n");
    sb.append("Name: ").append(client.getName()).append("\n");
    sb.append("Email: ").append(client.getEmail()).append("\n");
    sb.append("Status: ").append(this.status).append("\n");
    sb.append("\n");
    sb.append("----- Product(s) -----").append("\n");
    for (OrderItem item : this.items) {
      sb.append("Name: ").append(item.getProduct().getName()).append("\n");
      sb.append("Quantity: ").append(item.getQuantity()).append("\n");
      sb.append("Price: ").append(item.getProduct().getPrice()).append("\n");
      sb.append("\n");
    }
    sb.append("Total: $").append(String.format("%.2f", getTotal())).append("\n");
    return sb.toString();
  }
}

package module12.exercises.ex_10.entities;

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

  public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

  public void addItem(OrderItem item) {
    this.items.add(item);
  }

  public double getTotalPrice() {
    double total = 0;
    for (OrderItem item : items) {
      total += item.getTotal();
    }
    return total;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Moment: ")
        .append(formatter.format(moment))
        .append("\n");

    sb.append("Status: ").append(status).append("\n");

    sb.append("Client: ")
        .append(client.getName()).append("\n");
    sb.append("Email: ")
        .append(client.getEmail())
        .append("\n\n");

    sb.append("Items:\n");

    for (OrderItem item : items) {
      sb.append(item.getQuantity())
          .append(" x ")
          .append(item.getProduct().getName())
          .append(" - $")
          .append(String.format("%.2f", item.getProduct().getPrice()))
          .append(" = $")
          .append(String.format("%.2f", item.getTotal()))
          .append("\n");
    }

    sb.append("\nTotal price: $")
        .append(String.format("%.2f", getTotalPrice()));

    return sb.toString();
  }
}

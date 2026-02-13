package module15.exercises.ex_5.service;

import module15.exercises.ex_5.model.Order;
import module15.exercises.ex_5.model.OrderItem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {

  public List<Order> readOrders(String path) {
    Path ordersPath = Paths.get(path);
    List<Order> orders = new ArrayList<>();

    try {
      List<String> lines = Files.readAllLines(ordersPath);
      for (int i = 1; i < lines.size(); i++) {
        String[] line = lines.get(i).split(",");
        String orderId = line[0];
        String productName = line[1];
        double unitPrice = Double.parseDouble(line[2]);
        int quantity = Integer.parseInt(line[3]);

        Boolean orderIdFounded = false;
        for (Order order : orders) {
          if (order.getOrderId().equals(orderId)) {
            order.addItem(new OrderItem(productName, unitPrice, quantity));
            orderIdFounded = true;
            break;
          }
        }
        if (!orderIdFounded) {
          Order newOrder = new Order(orderId);
          newOrder.addItem(new OrderItem(productName, unitPrice, quantity));
          orders.add(newOrder);
        }
      }
    } catch (IOException e) {
      System.err.println("Error reading orders file");
    }
    return orders;
  }

  public void generateSummaryFile(List<Order> orders) {
    Path path = Paths.get("src/main/java/module15/exercises/ex_5/summary/").resolve("summary.csv");

    List<String> lines = new ArrayList<>();
    lines.add("order_id,total_price");

    for (Order order : orders) {
      lines.add(String.format("%s, %.2f", order.getOrderId(), order.getTotalOrderPrice()));
    }
    try {
      Path parentDir = path.getParent();
      if (parentDir != null && Files.notExists(parentDir)) {
        Files.createDirectories(parentDir);
      }
      Files.write(path, lines);
    } catch (IOException e) {
      System.err.println("Error to write file: " + e.getMessage());
    }
  }
}


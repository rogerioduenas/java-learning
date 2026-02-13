package module15.exercises.ex_5;

import module15.exercises.ex_5.model.Order;
import module15.exercises.ex_5.service.OrderProcessor;

import java.util.List;

public class Program {
  public static void main(String[] args) {
    String ordersPath = "src/main/java/module15/exercises/ex_5/orders.csv";
    OrderProcessor orderProcessor = new OrderProcessor();
    List<Order> orders = orderProcessor.readOrders(ordersPath);
    orderProcessor.generateSummaryFile(orders);
  }
}

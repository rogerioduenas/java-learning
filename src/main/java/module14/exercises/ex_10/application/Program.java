package module14.exercises.ex_10.application;

import module14.exercises.ex_10.domain.entities.Order;
import module14.exercises.ex_10.domain.entities.OrderStatus;
import module14.exercises.ex_10.domain.exceptions.DomainException;
import module14.exercises.ex_10.services.OrderService;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Order> orders = new ArrayList<>(List.of(
        new Order(1, OrderStatus.PENDING),
        new Order(2, OrderStatus.CANCELLED),
        new Order(3, OrderStatus.COMPLETED),
        new Order(1, OrderStatus.PENDING)
    ));

    OrderService orderService = new OrderService();

    for (Order order : orders) {
      try {
        orderService.process(order);
      } catch (DomainException e) {
        System.out.printf("ERROR: %s%n", e.getMessage());
      } catch (Exception e) {
        System.out.println("Something went wrong while processing the order");
      }
    }
  }
}

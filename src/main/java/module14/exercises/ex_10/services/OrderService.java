package module14.exercises.ex_10.services;

import module14.exercises.ex_10.domain.entities.Order;
import module14.exercises.ex_10.domain.entities.OrderStatus;
import module14.exercises.ex_10.domain.exceptions.DomainException;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

  private List<Order> orders = new ArrayList<>();

  public void process(Order order) {

    if (order.getOrderStatus() == OrderStatus.CANCELLED) {
      throw new DomainException("Order is cancelled");
    }

    if (orders.contains(order)) {
      throw new DomainException("Order already processed");
    }

    if (order.getOrderStatus() == OrderStatus.COMPLETED) {
      throw new DomainException("Completed orders cannot be processed");
    }

    orders.add(order);
    System.out.printf("Order was successfully processed -> %s%n", order);
  }
}

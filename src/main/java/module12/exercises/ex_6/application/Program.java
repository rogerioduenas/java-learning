package module12.exercises.ex_6.application;

import module12.exercises.ex_6.entities.Order;
import module12.exercises.ex_6.entities.OrderStatus;

public class Program {
  public static void main(String[] args) {
    Order newOrder = Order.create(OrderStatus.PENDING);
    System.out.println(newOrder);
    newOrder.setStatus(OrderStatus.PAID);
    System.out.println(newOrder);
  }
}

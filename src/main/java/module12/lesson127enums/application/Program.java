package module12.lesson127enums.application;

import module12.lesson127enums.entities.Order;
import module12.lesson127enums.entities.OrderStatus;

import java.time.LocalDateTime;

public class Program {
  public static void main(String[] args) {

    Order order = new Order(1111, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
    System.out.println(order);

    //convert string to enum
    Order order02 = new Order(2222, LocalDateTime.now(), OrderStatus.valueOf("SHIPPED"));
    System.out.println(order02);
  }
}

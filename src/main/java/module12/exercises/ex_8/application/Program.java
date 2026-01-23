package module12.exercises.ex_8.application;

import module12.exercises.ex_8.entities.*;

public class Program {
  public static void main(String[] args) {
    Order order = new Order(OrderStatus.PENDING, new Client("Mike", "mike@mike.com"));
    order.addItem(new OrderItem(2, new Product("bread", 10.00)));
    order.addItem(new OrderItem(2, new Product("milk", 5.00)));
    order.addItem(new OrderItem(6, new Product("tomato", 2.00)));
    System.out.println(order);
  }
}

package module_12_enumeration_and_composition.exercises.ex_10.application;

import module_12_enumeration_and_composition.exercises.ex_10.entities.*;

public class Program {
  public static void main(String[] args) {
    Order order = new Order(OrderStatus.PENDING, new Client("Mike", "mike@mike.com"));
    order.addItem(new OrderItem(3, new Product("bread", 10.00)));
    order.addItem(new OrderItem(3, new Product("milk", 10.00)));
    order.addItem(new OrderItem(3, new Product("tomato", 10.00)));

    System.out.println(order);
  }
}

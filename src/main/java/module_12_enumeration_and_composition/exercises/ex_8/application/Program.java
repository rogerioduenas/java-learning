package module_12_enumeration_and_composition.exercises.ex_8.application;

import module_12_enumeration_and_composition.exercises.ex_8.entities.*;

public class Program {
  public static void main(String[] args) {
    Order order = new Order(OrderStatus.PENDING, new Client("Mike", "mike@mike.com"));
    order.addItem(new OrderItem(2, new Product("bread", 10.00)));
    order.addItem(new OrderItem(2, new Product("milk", 5.00)));
    order.addItem(new OrderItem(6, new Product("tomato", 2.00)));
    System.out.println(order);
  }
}

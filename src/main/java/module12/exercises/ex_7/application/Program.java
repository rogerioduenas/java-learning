package module12.exercises.ex_7.application;

import module12.exercises.ex_7.entities.Order;
import module12.exercises.ex_7.entities.OrderItem;
import module12.exercises.ex_7.entities.Product;

public class Program {
  public static void main(String[] args) {
    Order order = new Order();

    Product bread = new Product("bread", 10.00);
    Product tomato = new Product("tomato", 20.00);
    Product milk = new Product("milk", 30.00);

    order.addItem(new OrderItem(1, bread));
    order.addItem(new OrderItem(2, tomato));
    order.addItem(new OrderItem(3, milk));

    System.out.println(order);
  }
}

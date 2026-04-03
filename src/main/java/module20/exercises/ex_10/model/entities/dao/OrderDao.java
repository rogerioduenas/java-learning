package module20.exercises.ex_10.model.entities.dao;

import module20.exercises.ex_10.model.entities.Order;

import java.util.List;

public interface OrderDao {

  Order registerOrder(Order order);
  List<Order> getOrders();
}

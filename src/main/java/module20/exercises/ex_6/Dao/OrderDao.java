package module20.exercises.ex_6.Dao;

import module20.exercises.ex_6.model.Order;

public interface OrderDao {

  void insert(Order order);
  Order findById(int id);
}

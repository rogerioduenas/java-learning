package module_20_JDBC.exercises.ex_6.Dao;

import module_20_JDBC.exercises.ex_6.model.Order;

public interface OrderDao {

  void insert(Order order);
  Order findById(int id);
}

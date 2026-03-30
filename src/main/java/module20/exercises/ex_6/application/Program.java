package module20.exercises.ex_6.application;

import module20.exercises.ex_6.Dao.OrderDao;
import module20.exercises.ex_6.Dao.impl.OrderDaoJDBC;
import module20.exercises.ex_6.model.Item;
import module20.exercises.ex_6.model.Order;
import module20.lessons.db.DB;

public class Program {
  public static void main(String[] args) {

    OrderDao orderDao = new OrderDaoJDBC(DB.getConnection());

    Order order = new Order(null, "Mike");

    order.addItem(new Item(null, "Tomato", 12, 1.99));
    order.addItem(new Item(null, "Strawberry", 8, 0.49));
    order.addItem(new Item(null, "Milk", 3, 2.99));

    orderDao.insert(order);
    orderDao.findById(12);
  }
}

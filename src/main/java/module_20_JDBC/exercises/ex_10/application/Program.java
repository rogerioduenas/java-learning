package module_20_JDBC.exercises.ex_10.application;

import module_12_enumeration_and_composition.exercises.ex_10.entities.OrderStatus;
import module_20_JDBC.exercises.ex_10.model.entities.Client;
import module_20_JDBC.exercises.ex_10.model.entities.Order;
import module_20_JDBC.exercises.ex_10.model.entities.dao.DaoFactory;
import module_20_JDBC.exercises.ex_10.model.entities.dao.OrderDao;

public class Program {
  public static void main(String[] args) {

    OrderDao orderDao = DaoFactory.createOrderDao();
    Client client = new Client(5L, "Caio");
    Order order = new Order(null, OrderStatus.PAID, 2000.0, client);

    orderDao.registerOrder(order);

    orderDao.getOrders().forEach(System.out::println);
  }
}

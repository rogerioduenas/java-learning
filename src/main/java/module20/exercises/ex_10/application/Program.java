package module20.exercises.ex_10.application;

import module12.exercises.ex_10.entities.OrderStatus;
import module20.exercises.ex_10.model.entities.Client;
import module20.exercises.ex_10.model.entities.Order;
import module20.exercises.ex_10.model.entities.dao.DaoFactory;
import module20.exercises.ex_10.model.entities.dao.OrderDao;

public class Program {
  public static void main(String[] args) {

    OrderDao orderDao = DaoFactory.createOrderDao();
    Client client = new Client(5L, "Caio");
    Order order = new Order(null, OrderStatus.PAID, 2000.0, client);

    orderDao.registerOrder(order);

    orderDao.getOrders().forEach(System.out::println);
  }
}

package module20.exercises.ex_10.model.entities.dao;

import module20.exercises.ex_10.model.entities.dao.impl.OrderDaoJDBC;
import module20.lessons.db.DB;

public class DaoFactory {

  public static OrderDao createOrderDao() {
    return new OrderDaoJDBC(DB.getConnection());
  }
}

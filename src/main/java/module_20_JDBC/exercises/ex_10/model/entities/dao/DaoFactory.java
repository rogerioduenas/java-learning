package module_20_JDBC.exercises.ex_10.model.entities.dao;

import module_20_JDBC.exercises.ex_10.model.entities.dao.impl.OrderDaoJDBC;
import module_20_JDBC.lessons.db.DB;

public class DaoFactory {

  public static OrderDao createOrderDao() {
    return new OrderDaoJDBC(DB.getConnection());
  }
}

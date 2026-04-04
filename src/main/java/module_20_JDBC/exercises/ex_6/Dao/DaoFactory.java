package module_20_JDBC.exercises.ex_6.Dao;

import module_20_JDBC.exercises.ex_6.Dao.impl.OrderDaoJDBC;
import module_20_JDBC.exercises.ex_6.db.DB;

public class DaoFactory {

  public static OrderDao getOrderDao(){
        return new OrderDaoJDBC(DB.getConnection());
    }
}

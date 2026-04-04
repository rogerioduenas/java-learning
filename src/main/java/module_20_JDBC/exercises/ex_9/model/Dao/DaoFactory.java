package module_20_JDBC.exercises.ex_9.model.Dao;

import module_20_JDBC.exercises.ex_9.db.DB;
import module_20_JDBC.exercises.ex_9.model.Dao.impl.PaymentDaoJDBC;

public class DaoFactory {

  public static PaymentDao createPaymentDao() {
    return new PaymentDaoJDBC(DB.getConnection());
  }
}

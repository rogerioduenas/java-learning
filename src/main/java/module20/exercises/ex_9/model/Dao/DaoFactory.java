package module20.exercises.ex_9.model.Dao;

import module20.exercises.ex_9.db.DB;
import module20.exercises.ex_9.model.Dao.impl.PaymentDaoJDBC;

import java.sql.Connection;

public class DaoFactory {

  public static PaymentDao createPaymentDao() {
    return new PaymentDaoJDBC(DB.getConnection());
  }
}

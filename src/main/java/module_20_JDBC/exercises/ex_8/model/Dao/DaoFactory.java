package module_20_JDBC.exercises.ex_8.model.Dao;

import module_20_JDBC.exercises.ex_8.db.DB;
import module_20_JDBC.exercises.ex_8.model.Dao.impl.ReservationDaoJDBC;

public class DaoFactory {

  public static ReservationDao createReservationDao() {
    return new ReservationDaoJDBC(DB.getConnection());
  }
}

package module_20_JDBC.exercises.ex_4.model.dao;

import module_20_JDBC.exercises.ex_4.db.DB;
import module_20_JDBC.exercises.ex_4.model.dao.impl.ClientDaoJDBC;

public class DaoFactory {

  public static ClientDao createClientDao() {
    return new ClientDaoJDBC(DB.getConnection());
  }
}

package module20.exercises.ex_7.model.Dao;

import module20.exercises.ex_7.db.DB;
import module20.exercises.ex_7.model.Dao.impl.ContractDaoJDBC;

public class DaoFactory {

  public ContractDao createContractDao() {
    return new ContractDaoJDBC(DB.getConnection());
  }
}

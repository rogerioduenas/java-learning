package module20.JDBC_DAO.model.dao;

import module20.JDBC_DAO.model.dao.impl.DepartmentDaoJDBC;
import module20.JDBC_DAO.model.dao.impl.SellerDaoJDBC;
import module20.db.config.DB;

public class DaoFactory {

  public static SellerDao createSellerDao() {
    return new SellerDaoJDBC(DB.getConnection());
  }

  public static DepartmentDao createDepartmentDao() {
    return new DepartmentDaoJDBC();
  }
}

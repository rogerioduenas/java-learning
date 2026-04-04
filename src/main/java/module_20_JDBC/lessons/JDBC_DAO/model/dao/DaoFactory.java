package module_20_JDBC.lessons.JDBC_DAO.model.dao;

import module_20_JDBC.lessons.JDBC_DAO.model.dao.impl.DepartmentDaoJDBC;
import module_20_JDBC.lessons.JDBC_DAO.model.dao.impl.SellerDaoJDBC;
import module_20_JDBC.lessons.db.DB;

public class DaoFactory {

  public static SellerDao createSellerDao() {
    return new SellerDaoJDBC(DB.getConnection());
  }

  public static DepartmentDao createDepartmentDao() {
    return new DepartmentDaoJDBC(DB.getConnection());
  }
}

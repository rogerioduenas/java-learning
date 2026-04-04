package module_20_JDBC.exercises.ex_5.dao;

import module_20_JDBC.exercises.ex_5.dao.impl.DepartmentDaoJDBC;
import module_20_JDBC.exercises.ex_5.dao.impl.EmployeeDaoJDBC;
import module_20_JDBC.exercises.ex_5.db.DB;
import module_20_JDBC.exercises.ex_5.model.Department;
import module_20_JDBC.exercises.ex_5.model.Employee;

public class DaoFactory {

  public static GenericCrud<Department> createDepartmentDao() {
    return new DepartmentDaoJDBC(DB.getConnection());
  }

  public static GenericCrud<Employee> createEmployeeDao() {
    return new EmployeeDaoJDBC(DB.getConnection());
  }
}

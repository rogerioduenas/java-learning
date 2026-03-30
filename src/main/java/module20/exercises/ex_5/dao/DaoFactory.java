package module20.exercises.ex_5.dao;

import module20.exercises.ex_5.dao.impl.DepartmentDaoJDBC;
import module20.exercises.ex_5.dao.impl.EmployeeDaoJDBC;
import module20.exercises.ex_5.db.DB;
import module20.exercises.ex_5.model.Department;
import module20.exercises.ex_5.model.Employee;

public class DaoFactory {

  public static GenericCrud<Department> createDepartmentDao() {
    return new DepartmentDaoJDBC(DB.getConnection());
  }

  public static GenericCrud<Employee> createEmployeeDao() {
    return new EmployeeDaoJDBC(DB.getConnection());
  }
}

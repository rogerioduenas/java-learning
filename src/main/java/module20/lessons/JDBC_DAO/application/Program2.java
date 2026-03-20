package module20.lessons.JDBC_DAO.application;

import module20.lessons.JDBC_DAO.model.dao.DaoFactory;
import module20.lessons.JDBC_DAO.model.dao.DepartmentDao;
import module20.lessons.JDBC_DAO.model.entities.Department;

import java.util.List;

public class Program2 {
  public static void main(String[] args) {
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    System.out.println("==================== Department ====================");

    System.out.println("----- findById -----");
    Department dep = departmentDao.findById(1);
    System.out.println(dep);

    System.out.println("----- findAll -----");
    List<Department> list = departmentDao.findAll();
    for (Department d : list) {
      System.out.println(d);
    }

    System.out.println("----- insert -----");
    Department newDepartment = new Department(null, "Music");
    departmentDao.insert(newDepartment);
    System.out.println("Inserted! New id: " + newDepartment.getId());

    System.out.println("----- update -----");
    Department dep2 = departmentDao.findById(1);
    dep2.setName("Food");
    departmentDao.update(dep2);
    System.out.println("Update completed");

    System.out.println("----- delete -----");
    departmentDao.deleteById(50);
    System.out.println("Delete completed");
  }
}

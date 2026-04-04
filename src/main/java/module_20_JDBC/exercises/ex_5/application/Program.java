package module_20_JDBC.exercises.ex_5.application;

import module_20_JDBC.exercises.ex_5.dao.GenericCrud;
import module_20_JDBC.exercises.ex_5.model.Department;
import module_20_JDBC.exercises.ex_5.model.Employee;

import static module_20_JDBC.exercises.ex_5.dao.DaoFactory.createDepartmentDao;
import static module_20_JDBC.exercises.ex_5.dao.DaoFactory.createEmployeeDao;

public class Program {
  public static void main(String[] args) {

    GenericCrud<Department> departmentDao = createDepartmentDao();
    GenericCrud<Employee> employeeDao = createEmployeeDao();

    Department department = new Department(4L, "Pet");
    Employee employee = new Employee(3L, "Maria", 2999.0, department);

    System.out.println("---------- Department ----------");
    departmentDao.insert(department);
    departmentDao.update(department);
    departmentDao.deleteById(department.getId());
    departmentDao.findById(4L);
    departmentDao.findAll().forEach(System.out::println);

    System.out.println("---------- Employee ----------");
    employeeDao.insert(employee);
    employeeDao.update(employee);
    employeeDao.deleteById(2L);
    employeeDao.findById(6L);
    employeeDao.findAll().forEach(System.out::println);
  }
}

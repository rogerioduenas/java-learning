package module_20_JDBC.exercises.ex_5.dao.impl;

import module_20_JDBC.exercises.ex_5.dao.GenericCrud;
import module_20_JDBC.exercises.ex_5.db.DB;
import module_20_JDBC.exercises.ex_5.db.DBException;
import module_20_JDBC.exercises.ex_5.model.Department;
import module_20_JDBC.exercises.ex_5.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoJDBC implements GenericCrud<Employee> {

  Connection connection;

  public EmployeeDaoJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void insert(Employee entity) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement("INSERT INTO employee (Name, Salary, DepartmentId) VALUES (?, ?, ?)");
      ps.setString(1, entity.getName());
      ps.setDouble(2, entity.getSalary());
      ps.setLong(3, entity.getDepartment().getId());
      int affectedRows = ps.executeUpdate();
      String result = (affectedRows > 0) ? "Employee inserted successfully" : "Employee insert failed";
      System.out.println(result);
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  @Override
  public void update(Employee entity) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement(
          "UPDATE employee SET Name = ?, Salary = ?, DepartmentId = ? WHERE Id = ?"
      );
      ps.setString(1, entity.getName());
      ps.setDouble(2, entity.getSalary());
      ps.setLong(3, entity.getDepartment().getId());
      ps.setLong(4, entity.getId());

      int affectedRows = ps.executeUpdate();
      String result = (affectedRows > 0) ? "Employee updated successfully" : "Employee update failed";
      System.out.println(result);
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  @Override
  public void deleteById(Long id) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement("DELETE FROM employee WHERE Id = ?");
      ps.setLong(1, id);
      int affectedRows = ps.executeUpdate();
      String result = (affectedRows > 0) ? "Employee deleted successfully" : "Employee delete failed";
      System.out.println(result);
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  @Override
  public Employee findById(Long id) {
    Employee employee = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement("SELECT employee.*, department.Name as DepName "
          + "FROM employee INNER JOIN department "
          + "ON employee.DepartmentId = department.Id "
          + "WHERE employee.Id = ?");
      ps.setLong(1, id);
      rs = ps.executeQuery();
      if (rs.next()) {
        Department dep = instantiateDepartment(rs);
        employee = instantiateEmployee(rs, dep);
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return employee;
  }

  @Override
  public List<Employee> findAll() {
    List<Employee> employees = new ArrayList<>();
    Map<Long, Department> map = new HashMap<>();
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement("SELECT employee.*, department.Name as DepName "
          + "FROM employee INNER JOIN department "
          + "ON employee.DepartmentId = department.Id ");
      rs = ps.executeQuery();
      while (rs.next()) {
        Long depId = rs.getLong("DepartmentId");
        Department dep = map.get(depId);
        if (dep == null) {
          dep = instantiateDepartment(rs);
          map.put(depId, dep);
        }
        employees.add(instantiateEmployee(rs, dep));
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    }
    return employees;
  }

  private Department instantiateDepartment(ResultSet rs) throws SQLException {
    Long depId = rs.getLong("DepartmentId");
    String depName = rs.getString("DepName");
    return new Department(depId, depName);
  }

  private Employee instantiateEmployee(ResultSet rs, Department dep) throws SQLException {
    Long id = rs.getLong("Id");
    String name = rs.getString("Name");
    Double salary = rs.getDouble("Salary");
    return new Employee(id, name, salary, dep);
  }
}

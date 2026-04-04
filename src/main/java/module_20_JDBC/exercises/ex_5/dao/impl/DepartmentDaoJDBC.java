package module_20_JDBC.exercises.ex_5.dao.impl;

import module_20_JDBC.exercises.ex_5.dao.GenericCrud;
import module_20_JDBC.exercises.ex_5.db.DB;
import module_20_JDBC.exercises.ex_5.db.DBException;
import module_20_JDBC.exercises.ex_5.model.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements GenericCrud<Department> {

  private Connection connection;

  public DepartmentDaoJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void insert(Department entity) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement("INSERT INTO department (Name) VALUES (?)");
      ps.setString(1, entity.getName());
      int affectedRows = ps.executeUpdate();
      String result = (affectedRows > 0) ? "Department inserted" : "Department not inserted";
      System.out.println(result);
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  @Override
  public void update(Department entity) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement("UPDATE department SET Name = ? WHERE id = ?");
      ps.setString(1, entity.getName());
      ps.setLong(2, entity.getId());
      int affectedRows = ps.executeUpdate();
      String result = (affectedRows > 0) ? "Department updated" : "Department not updated";
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
      ps = connection.prepareStatement("DELETE FROM department WHERE id = ?");
      ps.setLong(1, id);
      int affectedRows = ps.executeUpdate();
      String result = (affectedRows > 0) ? "Department deleted" : "Department not deleted";
      System.out.println(result);
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  @Override
  public Department findById(Long id) {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Department department = null;
    try {
      ps = connection.prepareStatement("SELECT * FROM department WHERE id = ?");
      ps.setLong(1, id);
      rs = ps.executeQuery();
      if (rs.next()) {
        department = new Department(rs.getLong("Id"), rs.getString("Name"));
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return department;
  }

  @Override
  public List<Department> findAll() {
    List<Department> list = new ArrayList<>();
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement("SELECT * FROM department");
      rs = ps.executeQuery();
      while (rs.next()) {
        Department department = new Department(rs.getLong("Id"), rs.getString("Name"));
        list.add(department);
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return list;
  }
}

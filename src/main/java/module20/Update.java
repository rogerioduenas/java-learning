package module20;

import module20.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

  public static void updateSalaryByDepartment(Double salary, Integer departmentId) {
    Connection conn = null;
    PreparedStatement ps = null;

    try {
      conn = DB.getConnection();
      ps = conn.prepareStatement(
          "UPDATE seller "
          + "SET BaseSalary = BaseSalary + ? "
          + "WHERE "
          + "(DepartmentId = ?)");

      ps.setDouble(1, salary);
      ps.setInt(2, departmentId);

      int rowsAffected = ps.executeUpdate();
      System.out.println(rowsAffected + " rows affected.");

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      DB.closeStatement(ps);
      DB.closeConnection();
    }
  }
}

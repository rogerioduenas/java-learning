package module20;

import module20.db.DB;
import module20.db.DBIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

  public static void deleteDepartment(Integer id) {
    Connection conn = null;
    PreparedStatement ps = null;

    try {
      conn = DB.getConnection();

      ps = conn.prepareStatement(
          "DELETE FROM department WHERE Id = ? ");

      ps.setInt(1, id);

      int rowsAffected = ps.executeUpdate();
      System.out.println(rowsAffected + " rows affected.");

    } catch (SQLException e) {
      throw new DBIntegrityException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
      DB.closeConnection();
    }
  }
}

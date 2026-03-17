package module20.JDBC_simple.repository;

import module20.db.config.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
private static Connection conn;
private static Statement st;
private static ResultSet rs;

  public static void readDepartments() {
    try {
      conn = DB.getConnection();
      st = conn.createStatement();
      rs = st.executeQuery("select * from department");

      while (rs.next()) {
        System.out.printf("%d - %s\n",
            rs.getInt("Id"),
            rs.getString("Name"));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(st);
      DB.closeConnection();
    }
  }

  public static void readSellers() throws SQLException {
      conn = DB.getConnection();
      st = conn.createStatement();
      rs = st.executeQuery("select * from seller");

      while (rs.next()) {
        System.out.printf("%d - %s - %s - %.2f\n",
            rs.getInt(1),
            rs.getString(2),
            rs.getString(3),
            rs.getDouble(5)
        );
      }
  }
}

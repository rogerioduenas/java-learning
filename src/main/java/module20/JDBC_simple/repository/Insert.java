package module20.JDBC_simple.repository;

import module20.db.config.DB;
import module20.db.config.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Insert {

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  private static Connection conn = DB.getConnection();;
  private static PreparedStatement ps;

  public static void insertSeller(String name) {
    String fakeEmail = String.format("%s@%s.com", name, name);

    try {
      ps = conn.prepareStatement(
          "INSERT INTO seller "
              + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
              + "VALUES "
              + "(?,?,?,?,?)",
          Statement.RETURN_GENERATED_KEYS);

      ps.setString(1, name);
      ps.setString(2, fakeEmail);
      ps.setDate(3, new java.sql.Date(sdf.parse("27/12/1990").getTime()));
      ps.setDouble(4, 3000.0);
      ps.setInt(5, 4);

      int rowsAffected = ps.executeUpdate();
      System.out.printf("Done! %d rows affected.%n", rowsAffected);
      if (rowsAffected > 0) {
        ResultSet rs = ps.getGeneratedKeys();
        while (rs.next()) {
          int id = rs.getInt(1);
          System.out.printf("Id: %d ", id);
        }
      }

    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public static void insertMultipleDepartments() throws SQLException {
    ps = conn.prepareStatement(
        "insert into department (Name) values ('Sport'), ('Fitness')",
        Statement.RETURN_GENERATED_KEYS);

    int rowsAffected = ps.executeUpdate();

    if (rowsAffected > 0) {
      ResultSet rs = ps.getGeneratedKeys();
      while (rs.next()) {
        int id = rs.getInt(1);
        System.out.printf("Id: %d ", id);
      }
    }
  }
}

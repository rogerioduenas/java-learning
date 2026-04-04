package module_20_JDBC.exercises.ex_3.application;

import module_20_JDBC.exercises.ex_3.db.DB;
import module_20_JDBC.exercises.ex_3.db.DBException;
import module_20_JDBC.exercises.ex_3.model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {

  private static Connection conn = null;

  public static void main(String[] args) {
    try {
      conn = DB.getConnection();
      insert(new Order(null, "Anna", 3.55));
      delete(9);
      listAll();
    } finally {
      DB.closeConnection();
    }
  }

  private static void insert(Order order) {
    PreparedStatement ps = null;
    try {
      ps = conn.prepareStatement("INSERT INTO orders (clientName, total) VALUES (?, ?)");
      ps.setString(1, order.getClientName());
      ps.setDouble(2, order.getTotal());
      int rowsAffected = ps.executeUpdate();
      if (rowsAffected > 0) {
        System.out.println("Order has been inserted successfully!");
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  private static void delete(Integer id) {
    PreparedStatement ps = null;
    try {
      ps = conn.prepareStatement("DELETE FROM orders WHERE id = ?");
      ps.setInt(1, id);

      int rowsAffected = ps.executeUpdate();
      String result = (rowsAffected > 0)
          ? "Order has been deleted successfully!"
          : "No order found with the given ID.";

      System.out.println(result);

    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  private static void listAll() {
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = conn.prepareStatement("SELECT * FROM orders");
      rs = ps.executeQuery();

      while (rs.next()) {
        System.out.printf("%d - %s - %.2f\n",
            rs.getLong("id"),
            rs.getString("clientName"),
            rs.getDouble("total"));
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
  }
}

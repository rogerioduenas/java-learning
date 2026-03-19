package module20.exercises.ex_1;

import module20.exercises.ex_1.db.DB;
import module20.exercises.ex_1.db.DBException;
import module20.exercises.ex_1.model.Product;

import java.sql.*;

public class Program {
  public static void main(String[] args) {
    try {
      insert(new Product(null, "melon", 1.99));
      insert(new Product(null, "soda", 3.99));
      listAll();
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeConnection();
    }
  }

  private static void insert(Product product) throws SQLException {
    Connection conn = DB.getConnection();
    PreparedStatement ps = null;
    try {
      ps = conn.prepareStatement("INSERT INTO products (name, price) VALUES (?, ?)");
      ps.setString(1, product.getName());
      ps.setDouble(2, product.getPrice());
      ps.executeUpdate();
    } finally {
      DB.closeStatement(ps);
    }
  }

  private static void listAll() throws SQLException {
    Connection conn = DB.getConnection();
    Statement st = null;
    ResultSet rs = null;
    try {
      st = conn.createStatement();
      rs = st.executeQuery("SELECT * FROM products");
      while (rs.next()) {
        System.out.printf("%d - %s - %.2f%n",
            rs.getLong("id"),
            rs.getString("name"),
            rs.getDouble("price"));
      }
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(st);
    }
  }
}
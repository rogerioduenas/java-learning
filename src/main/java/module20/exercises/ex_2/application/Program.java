package module20.exercises.ex_2.application;

import module20.exercises.ex_2.db.DB;
import module20.exercises.ex_2.db.DBException;
import module20.exercises.ex_2.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {
  public static void main(String[] args) {
    try {
      insert(new Product(null, "mango", 15));
      updateQuantity(12, 50);

      Product p = findById(1);
      System.out.println(p != null ? p : "Product not found");

    } catch (SQLException e) {
      throw new DBException("Error in Program: " + e.getMessage());
    } finally {
      DB.closeConnection();
    }
  }

  private static void insert(Product product) throws SQLException {
    Connection conn = DB.getConnection();
    PreparedStatement ps = null;
    try {
      ps = conn.prepareStatement("INSERT INTO products (name, quantity) VALUES (?, ?)");
      ps.setString(1, product.getName());
      ps.setInt(2, product.getQuantity());
      ps.executeUpdate();
    } finally {
      DB.closeStatement(ps);
    }
  }

  private static void updateQuantity(Integer id, Integer newQuantity) throws SQLException {
    if (newQuantity < 0) {
      throw new RuntimeException("Quantity cannot be negative");
    }

    Connection conn = DB.getConnection();
    PreparedStatement ps = null;
    try {
      ps = conn.prepareStatement("UPDATE products SET quantity = ? WHERE id = ?");
      ps.setInt(1, newQuantity);
      ps.setInt(2, id);
      ps.executeUpdate();
    } finally {
      DB.closeStatement(ps);
    }
  }

  private static Product findById(Integer id) throws SQLException {
    Connection conn = DB.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    Product product = null;

    try {
      ps = conn.prepareStatement("SELECT * FROM products WHERE id = ?");
      ps.setInt(1, id);
      rs = ps.executeQuery();

      if (rs.next()) {
        product = new Product(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getInt("quantity")
        );
      }
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return product;
  }
}
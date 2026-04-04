package module_20_JDBC.exercises.ex_6.Dao.impl;

import module_20_JDBC.exercises.ex_6.Dao.OrderDao;
import module_20_JDBC.exercises.ex_6.db.DB;
import module_20_JDBC.exercises.ex_6.db.DBException;
import module_20_JDBC.exercises.ex_6.model.Item;
import module_20_JDBC.exercises.ex_6.model.Order;

import java.sql.*;

public class OrderDaoJDBC implements OrderDao {

  private Connection connection;

  public OrderDaoJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void insert(Order order) {
    PreparedStatement psOrder = null;
    PreparedStatement psItem = null;
    ResultSet rs = null;
    try {
      connection.setAutoCommit(false);

      psOrder = connection.prepareStatement(
          "INSERT INTO purchase_order (customerName) VALUES (?)",
          Statement.RETURN_GENERATED_KEYS
      );
      psOrder.setString(1, order.getCustomerName());
      psOrder.executeUpdate();

      rs = psOrder.getGeneratedKeys();
      if (rs.next()) {
        Long orderId = rs.getLong(1);

        psItem = connection.prepareStatement(
            "INSERT INTO item (Name, Quantity, Price, Order_Id) VALUES (?, ?, ?, ?)"
        );

        for (Item item : order.getListItens()) {
          psItem.setString(1, item.getName());
          psItem.setInt(2, item.getQuantity());
          psItem.setDouble(3, item.getPrice());
          psItem.setLong(4, orderId);
          psItem.executeUpdate();
        }
      }

      connection.commit();
      System.out.println("Order inserted successfully");

    } catch (SQLException e) {
      DB.rollback(connection);
      throw new DBException(e.getMessage());
    } finally {
      DB.setAutoCommit(connection, true);
      DB.closeResultSet(rs);
      DB.closeStatement(psItem);
      DB.closeStatement(psOrder);
    }
  }

  @Override
  public Order findById(int id) {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Order order = null;
    try {
      ps = connection.prepareStatement("SELECT purchase_order.*, \n" +
          "       item.Id AS ItemId, \n" +
          "       item.Name AS ItemName, \n" +
          "       item.Quantity, \n" +
          "       item.Price\n" +
          "FROM purchase_order\n" +
          "LEFT JOIN item ON purchase_order.Id = item.Order_Id\n" +
          "WHERE purchase_order.Id = ?");
      ps.setInt(1, id);
      rs = ps.executeQuery();
      while (rs.next()) {
        if (order == null) {
          order = new Order(rs.getLong("Id"), rs.getString("customerName"));
        }
        Long itemId = rs.getLong("ItemId");
        if (itemId != 0) {
          String itemName = rs.getString("ItemName");
          int quantity = rs.getInt("Quantity");
          double price = rs.getDouble("Price");
          order.addItem(new Item(itemId, itemName, quantity, price));
        }
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    System.out.println(order);
    return order;
  }
}

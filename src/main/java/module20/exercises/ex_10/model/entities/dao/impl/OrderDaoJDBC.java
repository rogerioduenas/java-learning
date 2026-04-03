package module20.exercises.ex_10.model.entities.dao.impl;

import module12.exercises.ex_10.entities.OrderStatus;
import module20.exercises.ex_10.db.DB;
import module20.exercises.ex_10.db.DBException;
import module20.exercises.ex_10.model.entities.Client;
import module20.exercises.ex_10.model.entities.Order;
import module20.exercises.ex_10.model.entities.dao.OrderDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoJDBC implements OrderDao {

  private Connection connection;

  public OrderDaoJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public Order registerOrder(Order order) {
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement(
          "INSERT INTO orders2 (status, total, client_id) VALUES (?, ?, ?)",
          Statement.RETURN_GENERATED_KEYS);

      ps.setString(1, order.getStatus().name());
      ps.setDouble(2, order.getTotal());
      ps.setLong(3, order.getClient().getId());

      int affectedRows = ps.executeUpdate();

      if (affectedRows == 0) {
        throw new DBException("Error registering order.");
      }
      rs = ps.getGeneratedKeys();
      if (rs.next()) {
        order.setId(rs.getLong(1));
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return order;
  }

  @Override
  public List<Order> getOrders() {
    List<Order> list = new ArrayList<>();
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement(
          "SELECT orders2.*, clients.Name as clientName, clients.Email as clientEmail " +
              "FROM orders2 " +
              "INNER JOIN clients ON orders2.client_id = clients.id");

      rs = ps.executeQuery();

      while (rs.next()) {
        Long clientId = rs.getLong("client_id");
        String clientName = rs.getString("clientName");

        Client client = new Client(clientId, clientName);

        Long orderId = rs.getLong("id");
        Double total = rs.getDouble("total");
        OrderStatus status = OrderStatus.valueOf(rs.getString("status"));

        Order order = new Order(orderId, status, total, client);

        list.add(order);
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

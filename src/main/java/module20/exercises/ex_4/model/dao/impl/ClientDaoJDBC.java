package module20.exercises.ex_4.model.dao.impl;

import module20.exercises.ex_4.db.DB;
import module20.exercises.ex_4.db.DBException;
import module20.exercises.ex_4.model.dao.ClientDao;
import module20.exercises.ex_4.model.entities.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoJDBC implements ClientDao {

  private Connection connection;

  public ClientDaoJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void insert(Client client) {
    PreparedStatement pstm = null;

    try {
      pstm = connection.prepareStatement(
          "INSERT INTO clients (Name, Email) VALUES (?, ?)",
          Statement.RETURN_GENERATED_KEYS);

      pstm.setString(1, client.getName());
      pstm.setString(2, client.getEmail());

      int rowsAffected = pstm.executeUpdate();

      if (rowsAffected > 0) {
        ResultSet rs = pstm.getGeneratedKeys();
        if (rs.next()) {
          System.out.println("Inserted! New ID: " + rs.getLong(1));
        }
        DB.closeResultSet(rs);
      }
    } catch (SQLException e) {
      if (e.getErrorCode() == 1062) {
        throw new DBException("Error: Email already exists.");
      }
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(pstm);
    }
  }

  @Override
  public void update(Client client) {
    PreparedStatement pstm = null;

    try {
      pstm = connection.prepareStatement("UPDATE clients "
          + "SET Name = ?, Email = ? "
          + "WHERE Id = ?");
      pstm.setString(1, client.getName());
      pstm.setString(2, client.getEmail());
      pstm.setLong(3, client.getId());

      int rowsAffected = pstm.executeUpdate();

      String result = (rowsAffected > 0)
          ? "Client updated successfully"
          : "Client updated failed";

      System.out.println(result);

    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(pstm);
    }
  }

  @Override
  public void delete(Client client) {
    PreparedStatement pstm = null;

    try {
      pstm = connection.prepareStatement(
          "DELETE FROM clients "
              + "WHERE Id = ?");
      pstm.setLong(1, client.getId());

      int rowsAffected = pstm.executeUpdate();

      String result = (rowsAffected > 0)
          ? "Client deleted successfully"
          : "Client deleted failed";

      System.out.println(result);

    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(pstm);
    }
  }

  @Override
  public Client findById(Long id) {
    PreparedStatement pstm = null;
    ResultSet rs = null;
    Client client = null;

    try {
      pstm = connection.prepareStatement("SELECT * FROM clients WHERE Id = ?");
      pstm.setLong(1, id);

      rs = pstm.executeQuery();

      if (rs.next()) {
        Long Id = rs.getLong(1);
        String name = rs.getString(2);
        String email = rs.getString(3);

        client = new Client(Id, name, email);
      }

    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(pstm);
    }
    return client;
  }

  @Override
  public List<Client> findAll() {
    PreparedStatement pstm = null;
    ResultSet rs = null;
    List<Client> clients = new ArrayList<>();

    try {
      pstm = connection.prepareStatement("SELECT * FROM clients");
      rs = pstm.executeQuery();

      while (rs.next()) {
        Long Id = rs.getLong(1);
        String name = rs.getString(2);
        String email = rs.getString(3);
        Client client = new Client(Id, name, email);
        clients.add(client);
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(pstm);
    }
    return clients;
  }
}

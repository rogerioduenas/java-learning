package module_20_JDBC.exercises.ex_7.model.Dao.impl;

import module_20_JDBC.exercises.ex_7.db.DB;
import module_20_JDBC.exercises.ex_7.db.DBException;
import module_20_JDBC.exercises.ex_7.model.entities.Contract;
import module_20_JDBC.exercises.ex_7.model.Dao.ContractDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractDaoJDBC implements ContractDao {

  private Connection connection;

  public ContractDaoJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public Contract insert(Contract contract) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement(
          "INSERT INTO contract (ClientName, Value, Contract_date) VALUES (?,?,?)",
          java.sql.Statement.RETURN_GENERATED_KEYS);

      ps.setString(1, contract.getClientName());
      ps.setDouble(2, contract.getValue());
      ps.setObject(3, contract.getDate());

      int affectedRows = ps.executeUpdate();

      if (affectedRows > 0) {
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
          Long id = rs.getLong(1);
          contract.setId(id);
        }
        DB.closeResultSet(rs);
        return contract;
      }
      throw new DBException("Unexpected error! No rows affected.");
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  @Override
  public Contract update(Contract contract) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement("UPDATE contract SET ClientName = ?, Value = ?, Contract_date = ? WHERE Id = ?");
      ps.setString(1, contract.getClientName());
      ps.setDouble(2, contract.getValue());
      ps.setObject(3, contract.getDate());
      ps.setLong(4, contract.getId());
      int affectedRows = ps.executeUpdate();
      if (affectedRows == 0) {
        throw new DBException("Update failed: Contract ID " + contract.getId() + " not found.");
      }
      System.out.println("Successfully updated");
      return contract;
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  @Override
  public Boolean deleteById(Long id) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement("DELETE FROM contract WHERE Id = ?");
      ps.setLong(1, id);
      int affectedRows = ps.executeUpdate();
      return affectedRows != 0;
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
  }

  @Override
  public Contract findById(Long id) {
    Contract contract = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement("SELECT * FROM contract WHERE Id = ?");
      ps.setLong(1, id);
      rs = ps.executeQuery();
      if (rs.next()) {
        contract = instantiateContract(rs);
      }
      return contract;
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
  }

  @Override
  public List<Contract> findAll() {
    PreparedStatement ps = null;
    ResultSet rs = null;
    List<Contract> contracts = new ArrayList<>();
    try {
      ps = connection.prepareStatement("SELECT * FROM contract");
      rs = ps.executeQuery();
      while (rs.next()) {
        contracts.add(instantiateContract(rs));
      }
      return contracts;
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
  }

  @Override
  public List<Contract> findBetweenDates(LocalDate start, LocalDate end) {
    PreparedStatement ps = null;
    ResultSet rs = null;
    List<Contract> contracts = new ArrayList<>();
    try {
      ps = connection.prepareStatement("SELECT * FROM contract WHERE Contract_Date BETWEEN ? AND ?");
      ps.setObject(1, start);
      ps.setObject(2, end);
      rs = ps.executeQuery();
      while (rs.next()) {
        contracts.add(instantiateContract(rs));
      }
      return contracts;
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
  }

  private Contract instantiateContract(ResultSet rs) throws SQLException {
    return new Contract(
        rs.getLong("Id"),
        rs.getString("ClientName"),
        rs.getDouble("Value"),
        rs.getObject("Contract_date", LocalDate.class)
    );
  }
}

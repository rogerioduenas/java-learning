package module20.JDBC_DAO.model.dao.impl;

import module20.JDBC_DAO.model.dao.SellerDao;
import module20.JDBC_DAO.model.entities.Department;
import module20.JDBC_DAO.model.entities.Seller;
import module20.db.config.DB;
import module20.db.config.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {

  private Connection conn;

  public SellerDaoJDBC(Connection conn) {
    this.conn = conn;
  }

  @Override
  public void insert(Seller seller) {

  }

  @Override
  public void update(Seller seller) {

  }

  @Override
  public void deleteById(Integer id) {

  }

  @Override
  public Seller findById(Integer id) {
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
      ps = conn.prepareStatement(
          "SELECT seller.*,department.Name as DepName "
              + "FROM seller INNER JOIN department "
              + "ON seller.DepartmentId = department.Id "
              + "WHERE seller.Id = ?");

      ps.setInt(1, id);
      rs = ps.executeQuery();

      if (rs.next()) {
        Department dep = instantiateDepartment(rs);
        Seller seller = instantiateSeller(rs, dep);
        return seller;
      }
      return null;
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
      DB.closeResultSet(rs);
    }
  }

  @Override
  public List<Seller> findAll() {
    return List.of();
  }

  private Department instantiateDepartment(ResultSet rs) throws SQLException {
    Integer depId = rs.getInt("DepartmentId");
    String depName = rs.getString("DepName");
    return new Department(depId, depName);
  }

  private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
    Integer sellerId = rs.getInt("Id");
    String name = rs.getString("Name");
    String email = rs.getString("Email");
    Double salary = rs.getDouble("BaseSalary");
    LocalDateTime birthDate = rs.getTimestamp("BirthDate").toLocalDateTime();
    return new Seller(sellerId, name, email, birthDate, salary, dep);
  }

}

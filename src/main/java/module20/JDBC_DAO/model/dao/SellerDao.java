package module20.JDBC_DAO.model.dao;

import module20.JDBC_DAO.model.entities.Department;
import module20.JDBC_DAO.model.entities.Seller;

import java.util.List;

public interface SellerDao {

  void insert(Seller seller);
  void update(Seller seller);
  void deleteById(Integer id);
  Seller findById(Integer id);
  List<Seller> findByDepartment(Department department);
  List<Seller> findAll();
}

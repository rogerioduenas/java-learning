package module20.JDBC_DAO.application;

import module20.JDBC_DAO.model.dao.DaoFactory;
import module20.JDBC_DAO.model.dao.SellerDao;
import module20.JDBC_DAO.model.entities.Department;
import module20.JDBC_DAO.model.entities.Seller;

import java.util.List;


public class Program {
  public static void main(String[] args) {
    SellerDao sellerDao = DaoFactory.createSellerDao();
    System.out.println("==================== Seller ====================");
    System.out.println("----- findById -----");
    Seller seller = sellerDao.findById(3);
    System.out.println(seller);
    System.out.println("----- findByDepartment -----");
    List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
    for (Seller s : list) {
      System.out.println(s);
    }
    System.out.println("----- findAll -----");
    list = sellerDao.findAll();
    for (Seller s : list) {
      System.out.println(s);
    }
  }
}

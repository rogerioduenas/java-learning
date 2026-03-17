package module20.JDBC_DAO.application;

import module20.JDBC_DAO.model.dao.DaoFactory;
import module20.JDBC_DAO.model.dao.SellerDao;
import module20.JDBC_DAO.model.entities.Seller;


public class Program {
  public static void main(String[] args) {
    SellerDao sellerDao = DaoFactory.createSellerDao();
    System.out.println("==================== Seller ====================");
    System.out.println("----- findById -----");
    Seller seller = sellerDao.findById(3);
    System.out.println(seller);
  }
}

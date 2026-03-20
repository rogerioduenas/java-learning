package module20.lessons.JDBC_DAO.application;

import module20.lessons.JDBC_DAO.model.dao.DaoFactory;
import module20.lessons.JDBC_DAO.model.dao.SellerDao;
import module20.lessons.JDBC_DAO.model.entities.Department;
import module20.lessons.JDBC_DAO.model.entities.Seller;

import java.time.LocalDateTime;
import java.util.List;


public class Program {
  public static void main(String[] args) {
    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("==================== Seller ====================");

    System.out.println("----- findById -----");
    Seller seller = sellerDao.findById(3);
    System.out.println(seller);

    System.out.println("----- findByDepartment -----");
    Department dep = new Department(2, null);
    List<Seller> list = sellerDao.findByDepartment(dep);
    for (Seller s : list) {
      System.out.println(s);
    }
    System.out.println("----- findAll -----");
    list = sellerDao.findAll();
    for (Seller s : list) {
      System.out.println(s);
    }

    System.out.println("----- insert -----");
    Seller newSeller = new Seller(null, "Caio", "caio@caio.com", LocalDateTime.now(), 2500.00, dep);
    sellerDao.insert(newSeller);
    System.out.printf("Inserted! New id: %d\n", newSeller.getId());

    System.out.println("----- update -----");
    seller = sellerDao.findById(41);
    seller.setName("Anna");
    sellerDao.update(seller);
    System.out.printf("Updated completed! %s\n", sellerDao.findById(42));

    System.out.println("----- deleteById -----");
    sellerDao.deleteById(46);
    System.out.println("Deleted completed!");
  }
}

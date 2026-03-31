package module20.exercises.ex_7.application;

import module20.exercises.ex_7.db.DB;
import module20.exercises.ex_7.model.Dao.ContractDao;
import module20.exercises.ex_7.model.Dao.impl.ContractDaoJDBC;
import module20.exercises.ex_7.model.entities.Contract;

import java.time.LocalDate;

public class Program {
  public static void main(String[] args) {
    ContractDao contractDao = new ContractDaoJDBC(DB.getConnection());

    contractDao.insert(new Contract(null, "Maria", 3000.0, LocalDate.now()));

    contractDao.update(new Contract(3L, "Maria", 1500.0, LocalDate.now()));

    contractDao.deleteById(4L);

    contractDao.findById(3L);

    contractDao.findAll().forEach(System.out::println);

    contractDao.findBetweenDates(LocalDate.now().minusDays(2), LocalDate.now());
  }
}

package module_20_JDBC.exercises.ex_7.model.Dao;

import module_20_JDBC.exercises.ex_7.model.entities.Contract;

import java.time.LocalDate;
import java.util.List;

public interface ContractDao {

  Contract insert(Contract contract);
  Contract update(Contract contract);
  Boolean deleteById(Long id);
  Contract findById(Long id);
  List<Contract> findAll();
  List<Contract> findBetweenDates(LocalDate start, LocalDate end);
}

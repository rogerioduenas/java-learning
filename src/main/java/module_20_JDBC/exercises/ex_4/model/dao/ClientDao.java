package module_20_JDBC.exercises.ex_4.model.dao;

import module_20_JDBC.exercises.ex_4.model.entities.Client;

import java.util.List;

public interface ClientDao {

  void insert(Client client);
  void update(Client client);
  void delete(Client client);
  Client findById(Long id);
  List<Client> findAll();
}

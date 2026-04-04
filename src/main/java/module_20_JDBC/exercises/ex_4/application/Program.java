package module_20_JDBC.exercises.ex_4.application;

import module_20_JDBC.exercises.ex_4.model.dao.ClientDao;
import module_20_JDBC.exercises.ex_4.model.dao.DaoFactory;
import module_20_JDBC.exercises.ex_4.model.entities.Client;

public class Program {
  public static void main(String[] args) {
    ClientDao clientDao = DaoFactory.createClientDao();
    Client client = new Client(4L, "maria", "maria@maria.com");

    clientDao.insert(client);

    clientDao.update(client);

    clientDao.delete(client);

    System.out.println(clientDao.findById(4L));

    System.out.println(clientDao.findAll());
  }
}

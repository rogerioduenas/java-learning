package module_15_io.exercises.ex_8;

import module_15_io.exercises.ex_8.model.Client;
import module_15_io.exercises.ex_8.service.ClientImporter;

import java.util.List;

public class Program {

  public static void main(String[] args) {
    String filePath = "src/main/java/module15/exercises/ex_8/customers.txt";
    List<Client> clients = ClientImporter.importClients(filePath);
    for (Client client : clients) {
      System.out.println(client);
    }
  }
}

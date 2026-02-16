package module15.exercises.ex_8.service;

import module15.exercises.ex_8.model.Client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ClientImporter {

  public static List<Client> importClients(String filePath) {
    List<Client> clients = new ArrayList<>();
    Path path = Paths.get(filePath);

    try {
      List<String> lines = Files.readAllLines(path);
      for (String line : lines) {
        String[] field = line.split(",");
        if(field.length == 2) {
          String name = field[0].trim();
          String email = field[1].trim();
          if(!name.isEmpty() && !email.isEmpty()) {
            Client client = new Client(name, email);
            clients.add(client);
          }
        }
      }
    } catch (IOException e) {
      System.err.println("Error reading file: " + filePath);
    }
    return clients;
  }
}

package module16.exercises.ex_5.services;

import module16.exercises.ex_5.model.Client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientService {

  public static List<Client> getClientsSorted(Path path) throws IOException {
    List<Client> clients = new ArrayList<>();
    List<String> names = Files.readAllLines(path);

    for (String name : names) {
      String[] nameArray = name.split(" ");
      String firstName = nameArray[0];
      String lastName = nameArray[1];
      Client client = new Client(firstName, lastName);
      clients.add(client);
    }
    Collections.sort(clients);
    return clients;
  }
}

package module16.exercises.ex_5;

import module16.exercises.ex_5.model.Client;
import module16.exercises.ex_5.services.ClientService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Program {
  public static void main(String[] args) throws IOException {

    Path path = Paths.get("src/main/java/module16/exercises/ex_5/names.txt");
    List<Client> clients = ClientService.getClientsSorted(path);
    System.out.println(clients);
  }
}

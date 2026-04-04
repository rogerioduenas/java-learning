package module_17_generics_set_map.execises.ex_19;

import module_17_generics_set_map.execises.ex_19.model.Session;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("src/main/java/module17/execises/ex_19/session.csv");
    List<String> lines = Files.readAllLines(path);
    Map<String, Session> sessions = new HashMap<>();

    for (String line : lines.subList(1, lines.size())) {
      String[] fields = line.split(",");
      String token = fields[0].trim();
      String username = fields[1].trim();
      String action = fields[2].trim();

      switch (action) {
        case "CREATE":
          if (sessions.putIfAbsent(token, new Session(username, action)) != null) {
            System.out.println("Error: Token " + token + " is already in use.");
          } else {
            System.out.println("Success: Session created for " + username);
          }
          break;

        case "ACCESS":
          if (sessions.containsKey(token)) {
            System.out.println("Access granted: " + sessions.get(token).getUsername());
          } else {
            System.out.println("Access denied: Invalid or expired token " + token);
          }
          break;

        case "EXPIRE":
          sessions.remove(token);
          System.out.println("Logout: Session " + token + " terminated.");
          break;
      }
    }

    System.out.println("\n--- Active Server Sessions ---");
    sessions.forEach((token, session) ->
        System.out.println("Token: " + token + " | User: " + session.getUsername()));
  }
}
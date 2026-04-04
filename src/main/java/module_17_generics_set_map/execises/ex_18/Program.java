package module_17_generics_set_map.execises.ex_18;

import module_17_generics_set_map.execises.ex_18.model.Player;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program {
  public static void main(String[] args) throws IOException {
    Set<Player> players = new TreeSet<>();
    Path path = Path.of("src/main/java/module17/execises/ex_18/db/ranking.csv");
    List<String> lines = Files.readAllLines(path);

    for (String line : lines.subList(1, lines.size())) {
      String[] fields = line.split(",");
      String name = fields[0].trim();
      Integer score = Integer.parseInt(fields[1].trim());
      players.add(new Player(name, score));
    }

    for (Player player : players) {
      System.out.println(player);
    }
  }
}

package module_17_generics_set_map.execises.ex_14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("src/main/java/module17/execises/ex_14/votes.csv");
    Map<String, Integer> votes = new HashMap<>();
    List<String> lines = Files.readAllLines(path);

    for (int i = 1; i < lines.size(); i++) {
      String[] line = lines.get(i).split(",");
      String candidate = line[0];
      Integer vote = Integer.parseInt(line[1]);

      votes.put(candidate, votes.getOrDefault(candidate, 0) + vote);
    }
    System.out.println(votes);
  }
}

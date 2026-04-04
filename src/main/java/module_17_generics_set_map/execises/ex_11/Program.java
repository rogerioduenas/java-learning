package module_17_generics_set_map.execises.ex_11;

import module_17_generics_set_map.execises.ex_11.model.VisitLog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
  public static void main(String[] args) throws IOException {

    Path path = Paths.get("src/main/java/module17/execises/ex_11/visitors.csv");

    List<String> lines = Files.readAllLines(path);
    Set<VisitLog> visitLogs = new HashSet<>();

    for (int i = 1; i < lines.size(); i++) {
      String line = lines.get(i);
      String[] fields = line.split(",");
      String participantId = fields[0];
      Instant timestamp = Instant.parse(fields[1]);
      visitLogs.add(new VisitLog(participantId, timestamp));
    }

    System.out.println(visitLogs.size());
    System.out.println(visitLogs);
  }
}

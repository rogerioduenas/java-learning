package module17.lesson194solvedexercise.application;

import module17.lesson194solvedexercise.entities.LogEntry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("src/main/java/module17/lesson194solvedexercise/usersLog.csv");
    Set<LogEntry> set = new HashSet<>();

    List<String> lines = Files.readAllLines(path);
    for (String line : lines) {
      String[] fields = line.split(",");
      String username = fields[0];
      Instant moment =  Instant.parse(fields[1]);
      set.add(new LogEntry(username, moment));
    }
    System.out.println("Total users: " + set.size());
  }
}

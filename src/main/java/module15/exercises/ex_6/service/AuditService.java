package module15.exercises.ex_6.service;

import module15.exercises.ex_6.model.DirectoryAudit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class AuditService {

  public static DirectoryAudit scanDirectory(String filePath) {
    Path path = Paths.get(filePath);
    DirectoryAudit dirAudit = new DirectoryAudit();

    try (Stream<Path> stream = Files.list(path)) {
      List<Path> list = stream.toList();

      for (Path file : list) {
        if (Files.isDirectory(file)) {
          dirAudit.addDiretories(file.getFileName());
        }

        if (Files.isRegularFile(file)) {
          dirAudit.addFiles(file.getFileName());
        }
      }
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
    return dirAudit;
  }
}

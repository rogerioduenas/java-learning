package module_15_io.exercises.ex_10.service;

import module_15_io.exercises.ex_10.model.RequiredFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileValidationService {

  public static void validateExistence(List<RequiredFile> files) {
    for (RequiredFile file : files) {
      Path path = Paths.get(file.getPath());
      if (Files.notExists(path) || !Files.isRegularFile(path)) {
        throw new RuntimeException("CRITICAL ERROR: Essential file missing: " + path.toAbsolutePath());
      }
    }
    System.out.println("Validation successful! All essential files are present.");
  }
}

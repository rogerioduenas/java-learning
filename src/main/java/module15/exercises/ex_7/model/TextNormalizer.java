package module15.exercises.ex_7.model;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TextNormalizer {

  private final Path sourcePath;
  private final Path targetPath;

  public TextNormalizer(String sourcePath, String targetPath) {
    this.sourcePath = Paths.get(sourcePath);
    this.targetPath = Paths.get(targetPath);
  }

  public Path getSource() {
    return sourcePath;
  }

  public Path getTarget() {
    return targetPath;
  }
}

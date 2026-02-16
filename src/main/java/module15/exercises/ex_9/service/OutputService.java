package module15.exercises.ex_9.service;

import module15.exercises.ex_9.model.OutputContent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputService {

  public static void writeOutput(OutputContent outputContent, String destinationPath) {
    Path destination = Paths.get(destinationPath);
    String content = outputContent.getContent();
    try {
      Path parentDirectory = destination.getParent();
      if (parentDirectory != null) {
        Files.createDirectories(parentDirectory);
      }
      Files.writeString(destination, content);
    } catch (IOException e) {
      System.err.println("Error writing output to file: " + e.getMessage());
    }
  }
}

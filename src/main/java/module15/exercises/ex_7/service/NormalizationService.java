package module15.exercises.ex_7.service;

import module15.exercises.ex_7.model.TextNormalizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NormalizationService {

  public static void normalize(TextNormalizer textNormalizer) {

    Path source = textNormalizer.getSource();
    Path target = textNormalizer.getTarget();

    try {
      List<String> lines = Files.readAllLines(source);
      List<String> textNormalized = new ArrayList<>();

      for (String line : lines) {
        String cleanedLine = line.trim();
        cleanedLine = cleanedLine.replaceAll("\\s+", " ");
        if (!cleanedLine.isEmpty()) {
          textNormalized.add(cleanedLine);
        }
      }

      Files.write(target, textNormalized);

    } catch (IOException e) {
      System.out.println("Error while reading text normalizer.");
    }
  }
}

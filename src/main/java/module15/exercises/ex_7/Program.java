package module15.exercises.ex_7;

import module15.exercises.ex_7.model.TextNormalizer;
import module15.exercises.ex_7.service.NormalizationService;

public class Program {

  public static void main(String[] args) {
    String source = "src/main/java/module15/exercises/ex_7/dirty_text.txt";
    String destination = "src/main/java/module15/exercises/ex_7/normalized.txt";
    TextNormalizer textNormalizer = new TextNormalizer(source, destination);
    NormalizationService.normalize(textNormalizer);
  }
}

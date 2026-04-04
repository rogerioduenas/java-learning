package module_18_functional_programming_and_lambda_expressions.exercises.ex_8;

import module_18_functional_programming_and_lambda_expressions.exercises.ex_8.model.Subscription;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class Program {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("src/main/java/module18/exercises/ex_8/subscriptions");
    try (Stream<String> lines = Files.lines(path)) {
      List<Subscription> subscriptions = lines
          .skip(1)
          .map(line -> line.split(","))
          .map(column -> new Subscription(
              column[0],
              Double.parseDouble(column[1])
          )).toList();


      DoubleSummaryStatistics statistics = subscriptions.stream()
          .mapToDouble(Subscription::getValue)
          .summaryStatistics();

      System.out.printf("Average subscription price: %.2f%n", statistics.getAverage());
      System.out.println("Below-average customers:");
      subscriptions.stream()
          .filter(sub -> sub.getValue() < statistics.getAverage())
          .sorted(Comparator.comparingDouble(Subscription::getValue).reversed())
          .forEach(System.out::println);

    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }
  }
}

package module16.exercises.ex_8;

import module16.exercises.ex_8.model.Employee;
import module16.exercises.ex_8.services.Evaluation;
import module16.exercises.ex_8.services.ProductivityService;
import module16.exercises.ex_8.services.PunctualityService;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    Employee mike = new Employee("Mike", 3, 90);

    List<Evaluation> evaluations = new ArrayList<>();

    evaluations.add(new ProductivityService(mike, 100.0));
    evaluations.add(new PunctualityService(mike, 100.0));

    double sum = 0;
    for (Evaluation eval : evaluations) {
      double score = eval.calculate();
      System.out.printf("Score: %.2f%n", score);
      sum += score;
    }

    double finalAverage = sum / evaluations.size();
    System.out.printf("Employee: %s | Final Average: %.2f", mike.getName(), finalAverage);
  }
}
package module_18_functional_programming_and_lambda_expressions.exercises.ex_10;

import module_18_functional_programming_and_lambda_expressions.exercises.ex_10.model.ProductionBatch;

import java.util.List;
import java.util.stream.Stream;

public class Program {
  public static void main(String[] args) {
    Integer initialValue = 1000;
    List<ProductionBatch> batches = Stream.iterate(initialValue, i -> i + 1)
        .limit(10)
        .map(ProductionBatch::new)
        .toList();

    batches.forEach(System.out::println);
  }
}

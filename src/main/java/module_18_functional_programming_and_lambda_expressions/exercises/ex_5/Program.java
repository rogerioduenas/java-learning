package module_18_functional_programming_and_lambda_expressions.exercises.ex_5;

import module_18_functional_programming_and_lambda_expressions.exercises.ex_5.model.Sale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program {
  public static void main(String[] args) {
    List<Sale> sales = new ArrayList<>(Arrays.asList(
        new Sale("Logan", 4500.00),
        new Sale("Jean", 12500.50),
        new Sale("Scott", 2100.00),
        new Sale("Munroe", 8900.00),
        new Sale("Hank", 3200.75)
    ));

    List<Double> values = sales.stream()
        .map(Sale::getValue)
        .filter(value -> value > 5000.0).toList();

    Optional<Double> total = values.stream().reduce(Double::sum);

    System.out.printf("Total sales considered: %d%nTotal amount invoiced: %.2f",
        values.size(), total.orElse(0.0));
  }
}

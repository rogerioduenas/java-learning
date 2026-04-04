package module_18_functional_programming_and_lambda_expressions.exercises.ex_7;

import module_18_functional_programming_and_lambda_expressions.exercises.ex_7.model.EnergyUsage;

import java.util.*;

public class Program {
  public static void main(String[] args) {
    List<EnergyUsage> energyRecords = new ArrayList<>(Arrays.asList(
        new EnergyUsage("Residential Complex", 450.5),
        new EnergyUsage("Industrial Plant", 2850.0),
        new EnergyUsage("Small Shop", 120.2),
        new EnergyUsage("Residential Complex", 380.0),
        new EnergyUsage("Data Center", 5200.75)
    ));

    DoubleSummaryStatistics stats = energyRecords.stream()
        .mapToDouble(EnergyUsage::getConsumption)
        .summaryStatistics();

    System.out.printf("Average consumption: %.2f%n", stats.getAverage());
    System.out.printf("Highest consumption: %.2f%n", stats.getMax());
    System.out.printf("Total clients: %d%n", stats.getCount());
  }
}

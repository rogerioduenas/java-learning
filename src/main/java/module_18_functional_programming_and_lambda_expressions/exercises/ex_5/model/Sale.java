package module_18_functional_programming_and_lambda_expressions.exercises.ex_5.model;

public class Sale {

  private final Double value;

  public Sale(String seller, Double value) {
    this.value = value;
  }

  public Double getValue() {
    return value;
  }
}

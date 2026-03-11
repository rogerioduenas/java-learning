package module18.exercises.ex_5.model;

public class Sale {

  private final Double value;

  public Sale(String seller, Double value) {
    this.value = value;
  }

  public Double getValue() {
    return value;
  }
}

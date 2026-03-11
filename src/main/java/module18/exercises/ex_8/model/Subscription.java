package module18.exercises.ex_8.model;

public class Subscription {

  private final String name;
  private final Double value;

  public Subscription(String name, Double value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public Double getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.format("%s - %.2f", name, value);
  }
}

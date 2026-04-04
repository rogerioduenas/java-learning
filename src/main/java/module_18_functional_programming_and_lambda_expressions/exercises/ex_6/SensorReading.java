package module_18_functional_programming_and_lambda_expressions.exercises.ex_6;

public class SensorReading {
  private final String equipment;
  private final Double temperature;

  public SensorReading(String equipment, Double temperature) {
    this.equipment = equipment;
    this.temperature = temperature;
  }

  public Double getTemperature() {
    return temperature;
  }

  @Override
  public String toString() {
    return String.format("%s: %.2f degrees", equipment, temperature);
  }
}

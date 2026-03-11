package module18.exercises.ex_7.model;

public class EnergyUsage {

  private final String clientName;
  private final Double consumption;

  public EnergyUsage(String clientName, Double consumption) {
    this.clientName = clientName;
    this.consumption = consumption;
  }

  public Double getConsumption() {
    return consumption;
  }

  @Override
  public String toString() {
    return String.format("%s - %.2f", clientName, consumption);
  }
}

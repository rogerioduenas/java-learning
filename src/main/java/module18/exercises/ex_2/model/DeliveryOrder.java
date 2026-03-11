package module18.exercises.ex_2.model;

public class DeliveryOrder {

  private String clientName;
  private String destinationCity;
  private Double orderValue;
  private Integer priorityLevel;

  public DeliveryOrder(String clientName, String destinationCity, Double orderValue, Integer priorityLevel) {
    this.clientName = clientName;
    this.destinationCity = destinationCity;
    this.orderValue = orderValue;
    this.priorityLevel = priorityLevel;
  }

  public String getDestinationCity() {
    return destinationCity;
  }

  public Double getOrderValue() {
    return orderValue;
  }

  public Integer getPriorityLevel() {
    return priorityLevel;
  }

  @Override
  public String toString() {
    return String.format("%s, %s, %.2f, %d", clientName, destinationCity, orderValue, priorityLevel);
  }
}

package module_18_functional_programming_and_lambda_expressions.exercises.ex_1.model;

public class Proposal {

  private String supplierName;
  private Double totalPrice;
  private Integer deliveryDays;

  public Proposal(String supplierName, Double totalPrice, Integer deliveryDays) {
    this.supplierName = supplierName;
    this.totalPrice = totalPrice;
    this.deliveryDays = deliveryDays;
  }

  public Double getTotalPrice() {
    return totalPrice;
  }

  public Integer getDeliveryDays() {
    return deliveryDays;
  }


  @Override
  public String toString() {
    return String.format("%s - %.2f - %d", supplierName, totalPrice, deliveryDays);
  }
}

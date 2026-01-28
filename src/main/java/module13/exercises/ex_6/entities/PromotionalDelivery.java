package module13.exercises.ex_6.entities;

public class PromotionalDelivery extends Delivery {

  public PromotionalDelivery(int id, String destination, Double baseCost) {
    super(id, destination, baseCost);
  }

  @Override
  public Double costMultiplier() {
    return 1.05;
  }
}

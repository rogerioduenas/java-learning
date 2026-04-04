package module_13_inheritance_and_polymorphism.exercises.ex_6.entities;

public class ExpressDelivery extends Delivery {

  public ExpressDelivery(int id, String destination, Double baseCost) {
    super(id, destination, baseCost);
  }

  @Override
  public Double costMultiplier() {
    return 1.10;
  }
}

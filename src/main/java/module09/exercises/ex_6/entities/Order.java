package module09.exercises.ex_6.entities;

public class Order {
  private final int id;
  private final double totalValue;

  public Order(int id, double totalValue) {
    this.id = id;
    this.totalValue = totalValue;
  }

  public int getId() {
    return id;
  }

  public double getTotalValue() {
    return totalValue;
  }

  public void generateReport() {
    new OrderReport().print(this);
  }
}

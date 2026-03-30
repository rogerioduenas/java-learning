package module20.exercises.ex_6.model;

public class Item {

  private Long id;
  private String name;
  private Integer quantity;
  private Double price;

  public Item(Long id, String name, Integer quantity, Double price) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return String.format("%d - %s - %d - $%.2f%n", id, name, quantity, price);
  }
}

package module20.exercises.ex_2.model;

public class Product {

  private Long id;
  private String name;
  private Integer quantity;

  public Product(Long id, String name, Integer quantity) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return String.format("id: %s, name: %s, quantity: %d", id, name, quantity);
  }
}

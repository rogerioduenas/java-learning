package module20.exercises.ex_1.model;

public class Product {

  private Long id;
  private String name;
  private Double price;

  public Product(Long id, String name, Double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return String.format("id: %s, name: %s, price: %s]", id, name, price);
  }
}

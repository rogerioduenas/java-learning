package module13.exercises.ex_1.entities;

public class Product {

  private String name;
  private Double price;

  public Product(String name, Double price) {
    this.name = name;
    checkPrice(price);
    this.price = price;
  }

  private void checkPrice(Double price) {
    if (price <= 0) {
      throw new IllegalArgumentException("Price must be positive");
    }
  }

  public void updatePrice(Double newPrice) {
    checkPrice(newPrice);
    this.price = newPrice;
  }

  public String getData() {
    return "Name: " + name + " - Price: " + String.format("%.2f", price);
  }

  @Override
  public String toString() {
    return getData();
  }
}

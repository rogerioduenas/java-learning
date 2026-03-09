package module18.lesson205function.entities;

public class Product {

  private String name;
  private Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public static String staticUpperCase(Product product) {
    return product.getName().toUpperCase();
  }

  public String nonStaticUpperCase() {
    return name.toUpperCase();
  }

  @Override
  public String toString() {
    return String.format("name: %s, price: %.2f", name, price);
  }
}

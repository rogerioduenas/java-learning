package module13.exercises.ex_4.entities;

public class Product {

  private String name;
  private Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public Double getPrice() {
    return price;
  }

  public String priceTag() {
    return String.format("%s $%.2f", name, getPrice());
  }
}

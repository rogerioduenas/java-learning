package module17.lesson187delimitedgenerics.entities;

public class Product implements Comparable<Product> {

  private final String name;
  private final Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("%s - %.2f", name, price);
  }

  @Override
  public int compareTo(Product other) {
    return this.price.compareTo(other.price);
  }
}

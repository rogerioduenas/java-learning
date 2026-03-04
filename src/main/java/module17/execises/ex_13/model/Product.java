package module17.execises.ex_13.model;

import java.util.Objects;

public class Product implements Comparable<Product> {

  private final String  name;
  private final Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }

  @Override
  public String toString() {
    return String.format("%s - %.2f", name, price);
  }

  @Override
  public int compareTo(Product other) {
    return name.compareTo(other.name);
  }
}

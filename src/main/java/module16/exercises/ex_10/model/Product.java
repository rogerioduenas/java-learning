package module16.exercises.ex_10.model;

public class Product implements Comparable<Product> {

  private final String name;
  private final Double price;
  private final Integer quantitySold;

  public Product(String name, Double price, Integer quantitySold) {
    this.name = name;
    this.price = price;
    this.quantitySold = quantitySold;
  }


  @Override
  public int compareTo(Product other) {
    int res = other.quantitySold.compareTo(this.quantitySold);

    if (res == 0) {
      res = this.price.compareTo(other.price);
    }

    if (res == 0) {
      res = this.name.compareTo(other.name);
    }
    return res;
  }

  @Override
  public String toString() {
    return String.format("%s - $%.2f - %d", this.name, this.price, this.quantitySold);
  }
}

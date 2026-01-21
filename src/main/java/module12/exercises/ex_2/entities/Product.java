package module12.exercises.ex_2.entities;

public class Product {

  private int id;
  private String name;
  private double price;
  private ProductCategory category;

  private Product(int id, String name, double price, ProductCategory category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public static Product createProduct(int id, String name, double price, ProductCategory category) {
    if (price < 0) {
      throw new IllegalArgumentException("Price must be greater than 0");
    }
    return new Product(id, name, price, category);
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", price=" + price +
        ", category=" + category +
        '}';
  }
}

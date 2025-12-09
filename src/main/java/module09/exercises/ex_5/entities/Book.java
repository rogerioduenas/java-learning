package module09.exercises.ex_5.entities;

public class Book {
  private final String isbn;
  private String title;
  private double price;

  public Book(String isbn, String title, double price) {
    this.isbn = isbn;
    this.title = title;
    this.price = price;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price < 0) {
      System.out.println("Price cannot be negative");
      return;
    }
    this.price = price;
  }

  public String toString() {
    return String.format("ISBN: %s - Title: %s - Price: %.2f", isbn, title, price);
  }
}

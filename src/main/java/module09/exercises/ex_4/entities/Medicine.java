package module09.exercises.ex_4.entities;

import java.util.Objects;

public class Medicine {
  private String name;
  private double price;
  private int quantity;

  public Medicine() {
    this.name = "Undefined";
    this.price = 0;
    this.quantity = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null || name.isEmpty()) {
      System.out.println("Medicine name cannot be empty");
      return;
    }
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price < 0) {
      System.out.println("Medicine price cannot be negative");
      return;
    }
    this.price = price;
  }

  public void addStock(int quantity) {
    this.quantity += quantity;
  }

  public void removeStock(int quantity) {
    if (this.quantity < quantity) {
      System.out.printf("Sorry, you can't remove that much from stock. The total in stock is only %d.%n", this.quantity);
      return;
    }
    this.quantity -= quantity;
  }

  public String toString() {
    return String.format("Name: %s - Price: %.2f - Quantity: %d%n", this.name, this.price, this.quantity);
  };
}

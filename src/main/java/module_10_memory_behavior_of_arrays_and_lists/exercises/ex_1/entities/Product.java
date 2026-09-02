package module_10_memory_behavior_of_arrays_and_lists.exercises.ex_1.entities;

import utils.Validate;

public class Product {
  private final String name;
  private final Double price;
  private final Integer quantity;

  public Product(String name, Double price, Integer quantity) {
    Validate.notBlank(name, "Name cannot be blank");
    Validate.notNull(price, "Price cannot be null");
    Validate.notNegative(price, "Price cannot be negative");
    Validate.notNull(quantity, "Quantity cannot be null");
    Validate.notNegative(quantity, "Quantity cannot be negative");

    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public double totalValue() {
    return this.price * this.quantity;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  public Integer getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return String.format("Name: %s, Price: %.2f, Quantity: %d Total value: %.2f", name, price, quantity, totalValue());
  }
}
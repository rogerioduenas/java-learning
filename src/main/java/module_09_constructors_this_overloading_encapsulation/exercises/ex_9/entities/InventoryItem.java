package module_09_constructors_this_overloading_encapsulation.exercises.ex_9.entities;

import utils.Validate;

public class InventoryItem {
  private String name;
  private double unitPrice;
  private int quantity;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    Validate.notBlank(name, "Name cannot be null or empty");
    this.name = name;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    Validate.isTrue(unitPrice >= 0, "Unit price cannot be negative");
    this.unitPrice = unitPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    Validate.isTrue(quantity >= 0, "Quantity cannot be negative");
    this.quantity = quantity;
  }

  public void increase(int quantity) {
    Validate.positive(quantity, "Increase amount must be greater than zero");
    this.quantity += quantity;
  }

  public void decrease(int quantity) {
    Validate.positive(quantity, "Decrease amount must be greater than zero");
    Validate.isTrue(this.quantity >= quantity, "Quantity cannot go below zero");
    this.quantity -= quantity;
  }

  public double getTotalValue() {
    return this.quantity * this.unitPrice;
  }

  @Override
  public String toString() {
    return String.format(
        "Name: %s%nUnit price: %.2f%nQuantity: %d%nTotal Value in stock: %.2f%n",
        name, unitPrice, quantity, getTotalValue()
    );
  }
}


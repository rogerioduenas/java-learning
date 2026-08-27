package module_09_constructors_this_overloading_encapsulation.exercises.ex_7.vehicles;

import utils.Validate;

public class Vehicle {
  public String brand;
  protected String model;
  int year;
  private String secretCode;

  public Vehicle(String brand, String model, int year, String secretCode) {
    Validate.notBlank(brand, "Brand must not be blank");
    Validate.notBlank(model, "Model must not be blank");
    Validate.positive(year, "Year must be positive");
    Validate.notBlank(secretCode, "Secret code must not be blank");
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.secretCode = secretCode;
  }

  public String getSecretCode() {
    return "Access is only permitted within the Vehicle class.";
  }

  public String toString() {
    return String.format("Brand: %s\nModel: %s\nYear: %d\nSecret Code: %s%n", brand, model, year, secretCode);
  }
}

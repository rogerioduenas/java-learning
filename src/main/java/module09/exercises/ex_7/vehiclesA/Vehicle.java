package module09.exercises.ex_7.vehiclesA;

public class Vehicle {
  public String brand;
  protected String model;
  int year;
  private String secretCode;

  public Vehicle(String brand, String model, int year, String secretCode) {
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

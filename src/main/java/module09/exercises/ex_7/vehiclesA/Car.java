package module09.exercises.ex_7.vehiclesA;

public class Car extends Vehicle {
  public Car(String brand, String model, int year, String secretCode) {
    super(brand, model, year, secretCode);
  }

  public String toString() {
    return String.format("Brand: %s%n Model: %s%n Year: %d%n secretCode: %s%n",
        brand,
        model,
        year,
        getSecretCode());
  }
}

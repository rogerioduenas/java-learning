package module09.exercises.ex_7.vehiclesB;

import module09.exercises.ex_7.vehiclesA.Vehicle;

public class Truck extends Vehicle {

  public Truck(String brand, String model, int year, String secretCode) {
    super(brand, model, year, secretCode);
  }

  public String toString() {
    return String.format(
        "Brand: %s%nModel: %s%nYear: Not accessible — default visibility%nSecret Code: %s%n",
        brand,
        model,
        getSecretCode()
    );
  }
}

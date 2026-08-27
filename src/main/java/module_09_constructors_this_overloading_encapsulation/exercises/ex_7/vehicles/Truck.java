package module_09_constructors_this_overloading_encapsulation.exercises.ex_7.vehicles;

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

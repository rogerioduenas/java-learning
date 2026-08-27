package module_09_constructors_this_overloading_encapsulation.exercises.ex_7.vehicles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

  @Test
  void given_validVehicleData_when_creatingInstances_then_attributesAndInheritanceBehaveCorrectly() {
    Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2022, "SEC-123");
    Car car = new Car("Honda", "Civic", 2023, "SEC-456");
    Truck truck = new Truck("Volvo", "FH540", 2021, "SEC-789");

    assertAll(
        () -> assertEquals("Toyota", vehicle.brand),
        () -> assertTrue(vehicle.toString().contains("Corolla")),
        () -> assertEquals("Honda", car.brand),
        () -> assertEquals("Volvo", truck.brand),
        () -> assertTrue(truck.toString().contains("FH540"))
    );
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {"   ", "\t"})
  void given_blankOrNullBrandOrModel_when_creatingVehicle_then_throwsIllegalArgumentException(String invalidText) {
    assertThrows(
        IllegalArgumentException.class,
        () -> new Vehicle(invalidText, "Model", 2020, "SEC-123")
    );

    assertThrows(
        IllegalArgumentException.class,
        () -> new Vehicle("Brand", invalidText, 2020, "SEC-123")
    );
  }

  @ParameterizedTest
  @ValueSource(ints = {0, -1, -2000})
  void given_zeroOrNegativeYear_when_creatingVehicle_then_throwsIllegalArgumentException(int invalidYear) {
    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Vehicle("Toyota", "Corolla", invalidYear, "SEC-123")
    );

    assertEquals("Year must be positive", exception.getMessage());
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {"   "})
  void given_blankOrNullSecretCode_when_creatingVehicle_then_throwsIllegalArgumentException(String invalidSecret) {
    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Vehicle("Toyota", "Corolla", 2022, invalidSecret)
    );

    assertEquals("Secret code must not be blank", exception.getMessage());
  }
}

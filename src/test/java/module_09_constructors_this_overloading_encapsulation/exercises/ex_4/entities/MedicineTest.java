package module_09_constructors_this_overloading_encapsulation.exercises.ex_4.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MedicineTest {

  @Test
  void given_ValidMedicine_when_AddingStock_then_QuantityIsCorrect() {
    Medicine medicine = new Medicine();

    medicine.addStock(10);

    assertEquals(10, medicine.getQuantity());
  }

  @Test
  void given_ValidMedicine_when_RemovingStock_then_QuantityIsCorrect() {
    Medicine medicine = new Medicine("Ibuprofen", 10);

    medicine.removeStock(3);

    assertEquals(7, medicine.getQuantity());
  }

  @Test
  void given_ValidMedicine_when_SettingName_then_NameIsCorrect() {
    Medicine medicine = new Medicine();

    medicine.setName("Vodka");

    assertEquals("Vodka", medicine.getName());
  }

  @Test
  void given_ValidMedicine_when_SettingPositivePrice_then_PriceIsCorrect() {
    Medicine medicine = new Medicine();

    medicine.setPrice(10.0);

    assertEquals(10.0, medicine.getPrice());
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {" "})
  void given_BlankEmptyOrNullName_when_CreatingMedicine_then_ThrowsIllegalArgumentException(String invalidName) {
    int quantity = 10;

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Medicine(invalidName, quantity)
    );

    assertEquals("Medicine name cannot be null or blank", exception.getMessage());
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {" "})
  void given_BlankEmptyOrNullName_when_SettingName_then_ThrowsIllegalArgumentException(String invalidName) {
    Medicine medicine = new Medicine();

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> medicine.setName(invalidName)
    );

    assertEquals("Medicine name cannot be null or blank", exception.getMessage());
  }

  @Test
  void given_ValidMedicine_when_SettingNegativePrice_then_ThrowsIllegalArgumentException() {
    Medicine medicine = new Medicine();

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> medicine.setPrice(-10.0)
    );

    assertEquals("Price cannot be negative", exception.getMessage());
  }

  @Test
  void given_MedicineWithInsufficientStock_when_RemovingStock_then_ThrowsIllegalArgumentException() {
    Medicine medicine = new Medicine("Ibuprofen", 5);

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> medicine.removeStock(10)
    );

    assertEquals("Insufficient stock. Current stock: 5, requested: 10", exception.getMessage());
  }

  @Test
  void given_InvalidQuantity_when_AddingStock_then_ThrowsIllegalArgumentException() {
    Medicine medicine = new Medicine();

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> medicine.addStock(0)
    );

    assertEquals("Quantity to add must be greater than zero", exception.getMessage());
  }

  @Test
  void given_InvalidQuantity_when_RemovingStock_then_ThrowsIllegalArgumentException() {
    Medicine medicine = new Medicine("Ibuprofen", 10);

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> medicine.removeStock(0)
    );

    assertEquals("Quantity to remove must be greater than zero", exception.getMessage());
  }
}
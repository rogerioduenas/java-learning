package module_09_constructors_this_overloading_encapsulation.exercises.ex_9.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class InventoryItemTest {

  @Test
  @DisplayName("Should update stock quantity and calculate total inventory value correctly")
  void given_validItem_when_mutatingStateAndCalculatingTotalValue_then_updatesQuantityAndCalculatesCorrectly() {

    InventoryItem item = new InventoryItem();
    item.setName("Laptop");
    item.setUnitPrice(1200.0);
    item.setQuantity(10);

    item.increase(5);
    item.decrease(3);

    assertAll(
        () -> assertEquals("Laptop", item.getName()),
        () -> assertEquals(1200.0, item.getUnitPrice(), 0.001),
        () -> assertEquals(12, item.getQuantity()),
        () -> assertEquals(14400.0, item.getTotalValue(), 0.001)
    );
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {"   ", "\t"})
  @DisplayName("Should throw exception when setting invalid item name")
  void given_blankOrNullName_when_setName_then_throwsIllegalArgumentException(String invalidName) {
    InventoryItem item = new InventoryItem();

    assertThrows(
        IllegalArgumentException.class,
        () -> item.setName(invalidName)
    );
  }

  @ParameterizedTest
  @ValueSource(doubles = {-0.01, -10.0, -999.0})
  @DisplayName("Should throw exception when setting negative unit price")
  void given_negativeUnitPrice_when_setUnitPrice_then_throwsIllegalArgumentException(double invalidPrice) {
    InventoryItem item = new InventoryItem();

    assertThrows(
        IllegalArgumentException.class,
        () -> item.setUnitPrice(invalidPrice)
    );
  }

  @ParameterizedTest
  @ValueSource(ints = {-1, -10})
  @DisplayName("Should throw exception when setting negative initial quantity")
  void given_negativeQuantity_when_setQuantity_then_throwsIllegalArgumentException(int invalidQuantity) {
    InventoryItem item = new InventoryItem();

    assertThrows(
        IllegalArgumentException.class,
        () -> item.setQuantity(invalidQuantity)
    );
  }

  @ParameterizedTest
  @ValueSource(ints = {0, -1, -5})
  @DisplayName("Should throw exception for zero or negative increase/decrease amounts")
  void given_invalidQuantityToIncreaseOrDecrease_when_modifyingStock_then_throwsIllegalArgumentException(int invalidAmount) {
    InventoryItem item = new InventoryItem();
    item.setQuantity(10);

    assertAll(
        () -> assertThrows(IllegalArgumentException.class, () -> item.increase(invalidAmount)),
        () -> assertThrows(IllegalArgumentException.class, () -> item.decrease(invalidAmount))
    );
  }

  @Test
  @DisplayName("Should throw exception when attempting to decrease quantity below zero")
  void given_decreaseAmountGreaterThanCurrentQuantity_when_decrease_then_throwsIllegalArgumentException() {

    InventoryItem item = new InventoryItem();
    item.setQuantity(5);

    assertThrows(
        IllegalArgumentException.class,
        () -> item.decrease(6)
    );
  }
}


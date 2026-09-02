package module_10_memory_behavior_of_arrays_and_lists.exercises.ex_1.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

  @Test
  @DisplayName("Calculates individual subtotals and global inventory total")
  void given_ValidProductDataAndProductArray_when_CalculatingTotalValueAndInventorySum_then_ReturnsCorrectValues() {
    Product p1 = new Product("Laptop", 1200.00, 2);
    Product p2 = new Product("Mouse", 25.50, 4);
    Product p3 = new Product("Keyboard", 75.00, 1);

    Product[] inventory = {p1, p2, p3};

    double globalInventoryTotal = Arrays.stream(inventory)
        .mapToDouble(Product::totalValue)
        .sum();

    assertAll("Subtotals and Global Total Verification",
        () -> assertEquals(2400.00, p1.totalValue(), 0.001, "Incorrect subtotal for Laptop"),
        () -> assertEquals(102.00, p2.totalValue(), 0.001, "Incorrect subtotal for Mouse"),
        () -> assertEquals(75.00, p3.totalValue(), 0.001, "Incorrect subtotal for Keyboard"),
        () -> assertEquals(2577.00, globalInventoryTotal, 0.001, "Incorrect global inventory total")
    );
  }

  @ParameterizedTest
  @CsvSource({
      "0.0, 10, 0.0",
      "100.0, 0, 0.0",
      "0.0, 0, 0.0",
      "12.34, 3, 37.02",
      "0.01, 100, 1.00"
  })
  @DisplayName("Calculates total value correctly with zero or fractional decimals")
  void given_ZeroOrNegativeQuantityOrPrice_when_CalculatingProductTotalValue_then_ReturnsZeroOrCorrectScale(
      double price, int quantity, double expectedTotal) {

    Product product = new Product("Test Item", price, quantity);

    assertEquals(expectedTotal, product.totalValue(), 0.001);
  }

  @Test
  @DisplayName("Array Protection: Throws NullPointerException when iterating array with null positions")
  void given_ProductArrayWithNullElements_when_CalculatingGlobalInventoryTotal_then_ThrowsNullPointerException() {
    Product[] inventoryWithNulls = {
        new Product("Monitor", 300.0, 1),
        null,
        new Product("Cable", 10.0, 2)
    };

    assertThrows(NullPointerException.class, () -> {
      double total = 0;
      for (Product product : inventoryWithNulls) {
        total += Objects.requireNonNull(product, "Product position cannot be null").totalValue();
      }
    });
  }

  @ParameterizedTest
  @CsvSource({
      "'', 10.0, 1",
      "'   ', 10.0, 1",
      ", 10.0, 1",
      "'Item', -1.0, 1",
      "'Item', , 1",
      "'Item', 10.0, -1",
      "'Item', 10.0, "
  })
  @DisplayName("Throws IllegalArgumentException for invalid constructor arguments")
  void given_InvalidProductData_when_InstantiatingProduct_then_ThrowsIllegalArgumentException(
      String name, Double price, Integer quantity) {

    assertThrows(IllegalArgumentException.class, () -> new Product(name, price, quantity));
  }
}

package module_09_constructors_this_overloading_encapsulation.exercises.ex_1.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

  @Test
  void given_NameAndPrice_when_CreatingProduct_then_QuantityDefaultsToZero() {
    String name = "Notebook";
    double price = 3000.0;

    Product product = new Product(name, price);

    assertAll(() -> assertEquals("Notebook", product.getName()), () -> assertEquals(3000.0, product.getPrice()), () -> assertEquals(0, product.getQuantity()));
  }

  @Test
  void given_NamePriceAndQuantity_when_CreatingProduct_then_QuantityIsSetCorrectly() {
    String name = "Notebook";
    double price = 3000.0;
    int quantity = 100;

    Product product = new Product(name, price, quantity);

    assertEquals(quantity, product.getQuantity());
  }

  @Test
  void given_EmptyStock_when_AddProducts_then_QuantityIsUpdatedCorrectly() {
    Product product = new Product("Notebook", 3000.0);

    product.addProducts(10);

    assertEquals(10, product.getQuantity());
  }

  @Test
  void given_PositiveQuantity_when_RemovingProducts_then_QuantityIsUpdatedCorrectly() {
    Product product = new Product("Notebook", 3000.0, 10);

    product.removeProducts(3);

    assertEquals(7, product.getQuantity());
  }

  @Test
  void given_ProductsInStock_when_CalculatingTotalValueInStock_then_ReturnsCorrectValue() {
    Product product = new Product("Mouse", 10.0, 5);

    double total = product.getTotalValueInStock();

    assertEquals(50.0, total, 0.0001);
  }

  @Test
  void given_ValidProduct_when_CallingToString_then_ReturnsFormattedStringWithProductData() {
    Product product = new Product("TV", 1000.0, 2);

    String result = product.toString();

    assertAll("Checking toString content",
        () -> assertTrue(result.contains("TV"), "Should contain the product name"),
        () -> assertTrue(result.contains("1000"), "Should contain the price"),
        () -> assertTrue(result.contains("2"), "Should contain the quantity"),
        () -> assertTrue(result.contains("2000"), "Should contain the total stock value"));
  }

  @ParameterizedTest(name = "Test {index}: name=''{0}'', price={1}, quantity={2}")
  @MethodSource("provideInvalidProductArguments")
  void given_InvalidProductArguments_when_CreatingProduct_then_ThrowsIllegalArgumentException(String name, double price, int quantity) {

    assertThrows(IllegalArgumentException.class, () -> new Product(name, price, quantity));
  }

  private static Stream<Arguments> provideInvalidProductArguments() {
    return Stream.of(Arguments.of(null, 3000.0, 0),    // Null name
        Arguments.of("", 3000.0, 0),      // Empty name
        Arguments.of("Notebook", -50.0, 0), // Negative price
        Arguments.of("Notebook", 3000.0, -10) // Negative quantity
    );
  }

  @ParameterizedTest
  @ValueSource(ints = {-1, 0})
  void given_InvalidQuantity_when_AddingProducts_then_ThrowsIllegalArgumentException(int invalidQuantity) {
    Product product = new Product("Notebook", 1000.0, 10);

    assertThrows(IllegalArgumentException.class, () -> product.addProducts(invalidQuantity));
  }

  @ParameterizedTest
  @ValueSource(ints = {-1, 0})
  void given_InvalidQuantity_when_RemovingProducts_then_ThrowsIllegalArgumentException(int invalidQuantity) {
    Product product = new Product("Notebook", 1000.0, 10);

    assertThrows(IllegalArgumentException.class, () -> product.removeProducts(invalidQuantity));
  }

  @Test
  void given_ValidProduct_when_RemovingMoreThanQuantityAvailable_then_ThrowsIllegalArgumentException() {
    Product product = new Product("Notebook", 1000.0, 10);
    assertThrows(IllegalArgumentException.class, () -> product.removeProducts(11));
  }
}

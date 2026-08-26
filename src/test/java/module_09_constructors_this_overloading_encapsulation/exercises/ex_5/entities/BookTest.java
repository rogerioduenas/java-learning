package module_09_constructors_this_overloading_encapsulation.exercises.ex_5.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

  @Test
  void given_validBook_when_updated_then_stateChangesCorrectlyAndIsbnRemainsImmutable() {
    Book book = new Book("123-ABC", "Harry Potter", 19.90);

    book.setTitle("Potter Guy");
    book.setPrice(10.0);

    assertAll(
        () -> assertEquals("Potter Guy", book.getTitle()),
        () -> assertEquals(10.0, book.getPrice()),
        () -> assertEquals("123-ABC", book.getIsbn())
    );
  }
  
  @ParameterizedTest
  @ValueSource(doubles = {0.0, -0.01, -10.0})
  void given_negativeOrZeroPrice_when_instantiatingBook_then_throwIllegalArgumentException(double invalidPrice) {
    String isbn = "123-ABC";
    String name = "Harry Potter";

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Book(isbn, name, invalidPrice));

    assertEquals("Price must be greater than zero", exception.getMessage());
  }

  @ParameterizedTest
  @ValueSource(doubles = {0.0, -0.01, -10.0})
  void given_negativeOrZeroPrice_when_updatingPrice_then_throwIllegalArgumentException(double invalidPrice) {
    Book book = new Book("123-ABC", "Harry Potter", 19.90);

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> book.setPrice(invalidPrice));

    assertEquals("Price must be greater than zero", exception.getMessage());
  }
}

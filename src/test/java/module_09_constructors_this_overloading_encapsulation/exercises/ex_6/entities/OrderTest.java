package module_09_constructors_this_overloading_encapsulation.exercises.ex_6.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

  @Test
  void given_validOrder_when_generatingReport_then_delegatesSelfReferenceToOrderReportCorrectly() {
    Order order = new Order(1, 10.0);

    String report = order.generateReport();

    assertAll(
        () -> assertTrue(report.contains("1")),
        () -> assertTrue(report.contains("10.0"))
    );
  }

  @ParameterizedTest
  @ValueSource(ints = {0, -1, -10})
  void given_zeroOrNegativeId_when_creatingOrder_then_throwsIllegalArgumentException(int invadInt) {
    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Order(invadInt, 10.0)
    );

    assertEquals("Order ID must be positive", exception.getMessage());
  }

  @ParameterizedTest
  @ValueSource(doubles = {0.0, -0.01, -10.0})
  void given_negativeOrZeroTotalValue_when_creatingOrder_then_throwsIllegalArgumentException(double invadValue) {
    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Order(1, invadValue)
    );

    assertEquals("Total value must be positive", exception.getMessage());
  }
}

package module_09_constructors_this_overloading_encapsulation.exercises.ex_6.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderReportTest {

  @Test
  void given_nullOrder_when_printingReport_then_throwsIllegalArgumentException() {

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new OrderReport().print(null)
    );

    assertEquals("Order cannot be null", exception.getMessage());
  }
}

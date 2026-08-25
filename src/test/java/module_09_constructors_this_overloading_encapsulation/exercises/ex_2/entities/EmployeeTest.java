package module_09_constructors_this_overloading_encapsulation.exercises.ex_2.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

  @Test
  void given_ValidParameters_when_CreatingEmployee_then_AttributesAreSetCorrectly() {
    String name = "Mike";
    double salary = 1000.0;

    Employee employee = new Employee(name, salary);

    assertAll(
        () -> assertEquals("Mike", employee.getName()),
        () -> assertEquals(1000.0, employee.getSalary())
    );
  }

  @Test
  void given_ValidEmployee_when_CalculatingAnnualIncome_then_ReturnsCorrectAnnualValue() {
    Employee employee = new Employee("Mike", 1000.0);

    double annualIncome = employee.calculateAnnualIncome();

    assertEquals(12000.0, annualIncome);
  }

  @Test
  void given_ValidEmployee_when_CallingToString_then_ReturnsFormattedStringWithData() {
    Employee employee = new Employee("Mike", 1000.0);

    String result = employee.toString();

    assertAll(
        () -> assertTrue(result.contains("Mike"), "Should contain the employee name"),
        () -> assertTrue(result.contains("1000.0"), "Should contain the employee salary")
    );
  }

  @Test
  void given_ZeroSalary_when_CreatingEmployeeAndCalculatingIncome_then_ReturnsZero() {
    Employee employee = new Employee("Mike", 0.0);

    double annualIncome = employee.calculateAnnualIncome();

    assertEquals(0.0, annualIncome);
  }

  @Test
  void given_NegativeSalary_when_CreatingEmployee_then_ThrowsIllegalArgumentException() {
    double invalidSalary = -50.0;

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Employee("Mike", invalidSalary)
    );

    assertEquals("Employee salary cannot be negative", exception.getMessage());
  }

  @ParameterizedTest
  @ValueSource(strings = {"", "   "})
  void given_BlankOrEmptyName_when_CreatingEmployee_then_ThrowsIllegalArgumentException(String invalidName) {
    double validSalary = 1000.0;

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Employee(invalidName, validSalary)
    );

    assertEquals("Employee name cannot be null or blank", exception.getMessage());
  }

  @Test
  void given_NullName_when_CreatingEmployee_then_ThrowsIllegalArgumentException() {
    String invalidName = null;

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Employee(invalidName, 1000.0));

    assertEquals("Employee name cannot be null or blank", exception.getMessage());
  }
}

package module_09_constructors_this_overloading_encapsulation.exercises.ex_3.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

  @Test
  void given_NoArgumentsConstructor_when_UpdatingScore_then_ScoreIsUpdatedCorrectly() {
    Student student = new Student();

    student.updateScore(10.0);

    assertEquals(10.0, student.getScore());
  }

  @Test
  void given_NameOnlyConstructor_when_UpdatingScore_then_ScoreIsUpdatedFromZero() {
    Student student = new Student("Mike");

    student.updateScore(10.0);

    assertAll(
        () -> assertEquals("Mike", student.getName()),
        () -> assertEquals(10.0, student.getScore())
    );
  }

  @Test
  void given_ValidScore_when_UpdatingScore_then_ScoreIsUpdated() {
    Student student = new Student("Mike", 5.0);

    student.updateScore(8.5);

    assertEquals(8.5, student.getScore());
  }

  @ParameterizedTest
  @ValueSource(strings = {"", "   "})
  void given_BlankEmptyOrNullName_when_CreatingStudent_then_ThrowsIllegalArgumentException(String invalidName) {
    double validScore = 5.0;

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Student(invalidName, validScore)
    );

    assertEquals("Student name cannot be null or blank", exception.getMessage());
  }

  @Test
  void given_NegativeScore_when_CreatingStudent_then_ThrowsIllegalArgumentException() {
    double invalidScore = -1.0;

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> new Student("Mike", invalidScore));

    assertEquals("Student score cannot be negative", exception.getMessage());
  }

  @Test
  void given_NegativeScore_when_UpdatingScore_then_ThrowsIllegalArgumentException() {
    Student student = new Student("Mike", 5.0);

    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> student.updateScore(-1.0)
    );

    assertEquals("Student score cannot be negative", exception.getMessage());
  }
}

package module_09_constructors_this_overloading_encapsulation.exercises.ex_10.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AcademicRecordTest {

  @Test
  @DisplayName("Should initialize correct states across all overloaded constructors and update GPA safely")
  void given_validData_when_instantiatingViaOverloadedConstructorsAndUpdateGpa_then_maintainsImmutabilityAndCorrectState() {
    AcademicRecord record1 = new AcademicRecord("Mike", 202401, 8.5);

    AcademicRecord record2 = new AcademicRecord("Anna", 202402);

    AcademicRecord record3 = new AcademicRecord();
    record3.setGpa(9.0);

    assertAll(() -> assertEquals("Mike", record1.getStudentName()), () -> assertEquals(202401, record1.getRegistrationId()), () -> assertEquals(8.5, record1.getGpa(), 0.001),

        () -> assertEquals("Anna", record2.getStudentName()), () -> assertEquals(202402, record2.getRegistrationId()), () -> assertEquals(0.0, record2.getGpa(), 0.001),

        () -> assertEquals(9.0, record3.getGpa(), 0.001));
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {"   ", "\t"})
  @DisplayName("Should throw exception for null or blank student name")
  void given_invalidName_when_creatingAcademicRecord_then_throwsIllegalArgumentException(String invalidName) {
    assertThrows(IllegalArgumentException.class, () -> new AcademicRecord(invalidName, 1001, 8.0));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, -1, -500})
  @DisplayName("Should throw exception for zero or negative registration ID")
  void given_invalidRegistrationId_when_creatingAcademicRecord_then_throwsIllegalArgumentException(int invalidId) {
    assertThrows(IllegalArgumentException.class, () -> new AcademicRecord("Valid Name", invalidId, 8.0));
  }

  @ParameterizedTest
  @ValueSource(doubles = {-0.01, -1.0, 10.01, 15.0})
  @DisplayName("Should throw exception when GPA is out of range [0.0 - 10.0]")
  void given_gpaOutOfRange_when_creatingOrUpdatingGpa_then_throwsIllegalArgumentException(double invalidGpa) {
    assertAll(() -> assertThrows(IllegalArgumentException.class, () -> new AcademicRecord("Valid Name", 1001, invalidGpa)), () -> {
      AcademicRecord record = new AcademicRecord("Valid Name", 1001);
      assertThrows(IllegalArgumentException.class, () -> record.setGpa(invalidGpa));
    });
  }
}

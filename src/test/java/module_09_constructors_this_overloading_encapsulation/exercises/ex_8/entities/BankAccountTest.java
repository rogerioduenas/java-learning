package module_09_constructors_this_overloading_encapsulation.exercises.ex_8.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

  private static final double TAX_FEE = 5.0;

  @Test
  @DisplayName("Should execute initial constructors, deposits, and fee withdrawals permitting negative balance")
  void given_validAccount_when_performingDepositsAndWithdrawals_then_updatesBalanceApplyingFixedFeeAndPermitsNegativeBalance() {
    BankAccount account1 = new BankAccount(1001, "Mike", 500.0);
    account1.deposit(200.0);
    account1.withdraw(100.0);

    BankAccount account2 = new BankAccount(1002, "Anna");
    account2.setHolder("Cris");
    account2.withdraw(50.0);

    assertAll(
        () -> assertEquals(1001, account1.getNumber()),
        () -> assertEquals("Mike", account1.getHolder()),
        () -> assertEquals(595.0, account1.getBalance(), 0.001),

        () -> assertEquals(1002, account2.getNumber()),
        () -> assertEquals("Cris", account2.getHolder()),
        () -> assertEquals(-55.0, account2.getBalance(), 0.001)
    );
  }

  @ParameterizedTest
  @ValueSource(ints = {0, -1, -9999})
  @DisplayName("Should throw exception for invalid account numbers")
  void given_invalidAccountNumber_when_creatingAccount_then_throwsIllegalArgumentException(int invalidNumber) {
    assertThrows(
        IllegalArgumentException.class,
        () -> new BankAccount(invalidNumber, "Valid Holder")
    );
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {"   ", "\t"})
  @DisplayName("Should throw exception for null or blank holder on creation or update")
  void given_invalidHolder_when_creatingAccountOrUpdatingHolder_then_throwsIllegalArgumentException(String invalidHolder) {
    assertAll(
        () -> assertThrows(IllegalArgumentException.class, () -> new BankAccount(1001, invalidHolder)),
        () -> {
          BankAccount account = new BankAccount(1001, "Valid Holder");
          assertThrows(IllegalArgumentException.class, () -> account.setHolder(invalidHolder));
        }
    );
  }

  @ParameterizedTest
  @ValueSource(doubles = {0.0, -0.01, -100.0})
  @DisplayName("Should throw exception for zero or negative deposit and withdrawal amounts")
  void given_zeroOrNegativeAmount_when_depositingOrWithdrawing_then_throwsIllegalArgumentException(double invalidAmount) {
    BankAccount account = new BankAccount(1001, "Valid Holder", 100.0);

    assertAll(
        () -> assertThrows(IllegalArgumentException.class, () -> account.deposit(invalidAmount)),
        () -> assertThrows(IllegalArgumentException.class, () -> account.withdraw(invalidAmount))
    );
  }
}

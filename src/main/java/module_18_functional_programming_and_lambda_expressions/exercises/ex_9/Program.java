package module_18_functional_programming_and_lambda_expressions.exercises.ex_9;

import module_18_functional_programming_and_lambda_expressions.exercises.ex_9.model.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Transaction> transactions = new ArrayList<>(Arrays.asList(
        new Transaction("TX-100", 1500.00),
        new Transaction("TX-101", 45.90),
        new Transaction("TX-102", -20.00),
        new Transaction("TX-103", 0.0),
        new Transaction("TX-104", 850.00)
    ));

    Double maxLimit = 1000.0;
    boolean isAboveLimit = transactions.stream().anyMatch(t -> t.getAmount() > maxLimit);
    boolean isAllPositive = transactions.stream().allMatch(t -> t.getAmount() > 0);
    boolean noZeroFound = transactions.stream().noneMatch(t -> t.getAmount() == 0);

    System.out.printf("There is a transaction above the limit: %b%nAll are positive: %b%nNone are zero: %b%n", isAboveLimit, isAllPositive, noZeroFound);
  }
}

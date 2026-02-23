package module16.exercises.ex_9.services;

public class FinancialCalculator
    implements MonthlyInterestCalculator, AnnualInterestCalculator {

  @Override
  public double calculate(double amount) {
    throw new UnsupportedOperationException(
        "Use calculateMonthly or calculateAnnual");
  }

  public double calculateMonthly(double amount) {
    return MonthlyInterestCalculator.super.calculate(amount);
  }

  public double calculateAnnual(double amount) {
    return AnnualInterestCalculator.super.calculate(amount);
  }
}

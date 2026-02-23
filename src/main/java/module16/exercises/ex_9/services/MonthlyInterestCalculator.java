package module16.exercises.ex_9.services;

public interface MonthlyInterestCalculator {
  default double calculate(double amount){
    return amount * 1.02;
  }
}

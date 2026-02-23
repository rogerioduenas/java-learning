package module16.exercises.ex_9.services;

public interface AnnualInterestCalculator {

  default double calculate(double amount){
    return amount * 1.12;
  }
}

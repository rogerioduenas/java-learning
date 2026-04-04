package module_16_interface.exercises.ex_9.services;

public interface MonthlyInterestCalculator {
  default double calculate(double amount){
    return amount * 1.02;
  }
}

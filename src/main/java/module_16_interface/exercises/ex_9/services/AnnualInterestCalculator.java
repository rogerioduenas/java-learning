package module_16_interface.exercises.ex_9.services;

public interface AnnualInterestCalculator {

  default double calculate(double amount){
    return amount * 1.12;
  }
}

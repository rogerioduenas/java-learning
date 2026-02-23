package module16.exercises.ex_9;

import module16.exercises.ex_9.services.FinancialCalculator;

public class Program {

  public static void main(String[] args) {

    FinancialCalculator financialCalculator = new FinancialCalculator();
    System.out.println(financialCalculator.calculateAnnual(100));
    System.out.println(financialCalculator.calculateMonthly(100));
  }
}

package module16.exercises.ex_7;

import module16.exercises.ex_7.model.LoanRequest;
import module16.exercises.ex_7.services.BrazilInterestService;
import module16.exercises.ex_7.services.JapanInterestService;
import module16.exercises.ex_7.services.LoanService;

public class Program {
  public static void main(String[] args) {
    LoanRequest loan = new LoanRequest(100.0);
    BrazilInterestService br = new BrazilInterestService(0.1);
    JapanInterestService jp = new JapanInterestService(0.2);
    LoanService loanService = new LoanService(loan, jp);

    System.out.println(loanService.getPaymentTotal(3));
  }
}

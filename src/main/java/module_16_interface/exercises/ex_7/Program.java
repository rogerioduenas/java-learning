package module_16_interface.exercises.ex_7;

import module_16_interface.exercises.ex_7.model.LoanRequest;
import module_16_interface.exercises.ex_7.services.BrazilInterestService;
import module_16_interface.exercises.ex_7.services.JapanInterestService;
import module_16_interface.exercises.ex_7.services.LoanService;

public class Program {
  public static void main(String[] args) {
    LoanRequest loan = new LoanRequest(100.0);
    BrazilInterestService br = new BrazilInterestService(0.1);
    JapanInterestService jp = new JapanInterestService(0.2);
    LoanService loanService = new LoanService(loan, jp);

    System.out.println(loanService.getPaymentTotal(3));
  }
}

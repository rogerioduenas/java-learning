package module16.exercises.ex_7.services;

import module16.exercises.ex_7.model.LoanRequest;

public class LoanService {

  private LoanRequest loanRequest;
  private InterestService interestService;

  public LoanService(LoanRequest loanRequest, InterestService interestService) {
    this.loanRequest = loanRequest;
    this.interestService = interestService;
  }

  public double getPaymentTotal(int months) {
    double amount = loanRequest.getAmount();
    return interestService.calculatePayment(amount, months);
  }

}

package module16.exercises.ex_2.services;

import module16.exercises.ex_2.model.Contract;
import module16.exercises.ex_2.model.Installment;

import java.time.LocalDate;

public class ContractService {

  private Contract contract;
  private OnlinePaymentService onlinePaymentService;

  public ContractService(Contract contract, OnlinePaymentService onlinePaymentService) {
    this.contract = contract;
    this.onlinePaymentService = onlinePaymentService;
  }

  public void generateInstallments(int months) {
    LocalDate date = contract.getDate();
    double amount = contract.getAmount();
    double paymentFee = onlinePaymentService.paymentFee();
    double total = (amount / months) * (paymentFee + 1);
    for (int i = 1; i <= months; i++) {
      LocalDate nextDate = date.plusMonths(i);
      contract.setInstallment(new Installment(nextDate, total));
    }
  }
}

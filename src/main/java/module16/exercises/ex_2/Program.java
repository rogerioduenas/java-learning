package module16.exercises.ex_2;


import module16.exercises.ex_2.model.Contract;
import module16.exercises.ex_2.services.ContractService;
import module16.exercises.ex_2.services.PaypalService;
import module16.exercises.ex_2.services.StripeService;

import java.time.LocalDate;

public class Program {
  public static void main(String[] args) {

    PaypalService ps = new PaypalService();
    StripeService ss = new StripeService();

    Contract contract = new Contract(8101, LocalDate.now(), 600.0);
    ContractService contractService = new ContractService(contract, ps);
    contractService.generateInstallments(3);
    System.out.println(contract.getInstallment());
  }
}

package module16.lesson178correctedexercise.application;

import module16.lesson178correctedexercise.entities.Contract;
import module16.lesson178correctedexercise.entities.Installment;
import module16.lesson178correctedexercise.services.ContractService;
import module16.lesson178correctedexercise.services.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {

  public static void main(String[] args) throws ParseException {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    int number = 8071;
    LocalDate date = LocalDate.parse("17/02/2026", fmt);
    double totalValue = 600.0;
    Contract contract = new Contract(number, date, totalValue);


    ContractService contractService = new ContractService(new PaypalService());

    int numberOfInstallments = 12;
    contractService.processContract(contract, numberOfInstallments);

    System.out.println("===== Installments =====");
    for (Installment installment : contract.getInstallments()) {
      System.out.println(installment);
    }
  }
}

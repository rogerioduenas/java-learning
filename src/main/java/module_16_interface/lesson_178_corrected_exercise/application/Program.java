package module_16_interface.lesson_178_corrected_exercise.application;

import module_16_interface.lesson_178_corrected_exercise.entities.Contract;
import module_16_interface.lesson_178_corrected_exercise.entities.Installment;
import module_16_interface.lesson_178_corrected_exercise.services.ContractService;
import module_16_interface.lesson_178_corrected_exercise.services.PaypalService;

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

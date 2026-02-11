package module15.exercises.ex_2.Application;

import module15.exercises.ex_2.model.Contract;
import module15.exercises.ex_2.service.ContractReportService;

import java.util.List;

public class Program {
  public static void main(String[] args) {

    String path = "src/main/java/module15/exercises/ex_2/contracts.txt";

    ContractReportService contractReportService = new ContractReportService(path);
    List<Contract> activeContracts = contractReportService.filterActiveContracts();
    contractReportService.generateReport(activeContracts);
  }
}

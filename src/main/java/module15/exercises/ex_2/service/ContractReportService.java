package module15.exercises.ex_2.service;

import module15.exercises.ex_2.model.Contract;
import module15.exercises.ex_2.repository.ContractRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractReportService {

  private String path;

  public ContractReportService(String path) {
    this.path = path;
  }

  public List<Contract> filterActiveContracts() {
    List<String> contracts = ContractRepository.loadContracts(path);
    List<Contract> activeContracts = new ArrayList<>();

    for (String contract : contracts) {

      String[] ct = contract.split(";");

      if (ct[4].equals("active")) {
        String contractId = ct[0];
        String contractName = ct[1];
        LocalDate startDate = LocalDate.parse(ct[2]);
        LocalDate endDate = LocalDate.parse(ct[3]);

        activeContracts.add(new Contract(contractId, contractName, startDate, endDate));
      }
    }
    return activeContracts;
  }

  public void generateReport(List<Contract> contracts) {
    for (Contract contract : contracts) {
      System.out.println(contract);
    }
  }
}

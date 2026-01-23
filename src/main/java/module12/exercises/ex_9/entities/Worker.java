package module12.exercises.ex_9.entities;

import java.util.ArrayList;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;
  private Department department;

  private List<Contract> contracts = new ArrayList<>();

  public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public void addContract(Contract contract) {
    this.contracts.add(contract);
  }

  public Double income(int month, int year) {
    Double total = baseSalary;
    for(Contract contract : this.contracts) {
      if (contract.getDate().getMonth().getValue() == month && contract.getDate().getYear() == year) {
        total += contract.getTotalValue();
      }
    }
    return total;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("----- Worker Details -----\n");
    sb.append("Name: ").append(this.name).append("\n");
    sb.append("Department: ").append(this.department.getName()).append("\n");
    sb.append("Level: ").append(this.level).append("\n");
    sb.append("BaseSalary: ").append(this.baseSalary).append("\n");
    sb.append("----- Contracts ----- \n");
    for(Contract contract : this.contracts) {
      sb.append(contract).append("\n");
    }
    return sb.toString();
  }
}

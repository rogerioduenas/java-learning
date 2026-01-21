package module12.lesson130composition.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;

  private Department department;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
  }


  public String getName() {
    return name;
  }

  public Department getDepartment() {
    return department;
  }

  public void addContract(HourContract contract) {
    this.contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    this.contracts.remove(contract);
  }

  public Double income(int year, int month) {
    Double sum = baseSalary;

    for (HourContract contract : contracts) {
      LocalDate date = contract.getDate();
      int contract_year = date.getYear();
      int contract_month = date.getMonthValue();

      if (year == contract_year && month == contract_month) {
        sum += contract.totalValue();
      }
    }
    return sum;
  }
}

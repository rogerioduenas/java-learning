package module16.exercises.ex_2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

  private Integer contractNumber;
  private LocalDate date;
  private double amount;

  private List<Installment> installment = new ArrayList<>();

  public Contract(Integer contractNumber, LocalDate date, double amount) {
    this.contractNumber = contractNumber;
    this.date = date;
    this.amount = amount;
  }

  public LocalDate getDate() {
    return date;
  }

  public double getAmount() {
    return amount;
  }

  public List<Installment> getInstallment() {
    return installment;
  }

  public void setInstallment(Installment installment) {
    this.installment.add(installment);
  }
}

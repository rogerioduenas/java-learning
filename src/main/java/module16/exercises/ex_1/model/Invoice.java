package module16.exercises.ex_1.model;

public class Invoice {

  private double basicPayment;
  private Double tax;

  public Invoice(double basicPayment, Double tax) {
    this.basicPayment = basicPayment;
    this.tax = tax;
  }

  public double getTotalTax() {
    return tax;
  }

  public double getBasicPayment() {
    return basicPayment;
  }

  public double getTotalPayment() {
    return basicPayment + tax;
  }

}

package module16.exercises.ex_3.services;

public class BankInvoicePayment implements Payment {

  @Override
  public double paymentFee(double amount) {
    return 3.0;
  }
}

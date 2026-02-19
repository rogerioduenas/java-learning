package module16.exercises.ex_3.services;

public class CreditCardPayment implements Payment {

  @Override
  public double paymentFee(double amount) {
    return amount * 0.025;
  }
}

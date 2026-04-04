package module_16_interface.exercises.ex_3.services;

public class CreditCardPayment implements Payment {

  @Override
  public double paymentFee(double amount) {
    return amount * 0.025;
  }
}

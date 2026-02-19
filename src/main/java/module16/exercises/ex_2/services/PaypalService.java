package module16.exercises.ex_2.services;

public class PaypalService implements OnlinePaymentService {

  @Override
  public double paymentFee() {
    return 0.02;
  }
}

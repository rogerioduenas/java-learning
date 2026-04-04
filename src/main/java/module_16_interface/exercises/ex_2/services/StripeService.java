package module_16_interface.exercises.ex_2.services;

public class StripeService implements OnlinePaymentService {

  public double paymentFee() {
    return 0.03;
  }
}

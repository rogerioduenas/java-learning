package module16.lesson178correctedexercise.services;

public interface OnlinePaymentService {

  double paymentFee(double amount);

  double interest(double amount, int months);
}

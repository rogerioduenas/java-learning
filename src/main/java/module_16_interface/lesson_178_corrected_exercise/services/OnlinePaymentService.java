package module_16_interface.lesson_178_corrected_exercise.services;

public interface OnlinePaymentService {

  double paymentFee(double amount);

  double interest(double amount, int months);
}

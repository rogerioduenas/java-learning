package module_16_interface.exercises.ex_3.services;

import module_16_interface.exercises.ex_3.model.Order;

public class PaymentService {

  private Payment payment;

  public PaymentService(Payment payment) {
    this.payment = payment;
  }

  public void processOrder(Order order) {
    double amount = order.getAmount();
    double fee = payment.paymentFee(amount);

    order.setTotalAmount(fee + amount);
  }
}

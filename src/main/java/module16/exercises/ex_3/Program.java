package module16.exercises.ex_3;

import module16.exercises.ex_3.model.Order;
import module16.exercises.ex_3.services.BankInvoicePayment;
import module16.exercises.ex_3.services.CreditCardPayment;
import module16.exercises.ex_3.services.PaymentService;
import module16.exercises.ex_3.services.InstantPayment;

public class Program {
  public static void main(String[] args) {

    Order order = new Order("81js8", 100.0);

    CreditCardPayment creditCard = new CreditCardPayment();
    InstantPayment instant = new InstantPayment();
    BankInvoicePayment invoice = new BankInvoicePayment();

    PaymentService paymentService = new PaymentService(invoice);
    paymentService.processOrder(order);
    System.out.println(order);
  }
}

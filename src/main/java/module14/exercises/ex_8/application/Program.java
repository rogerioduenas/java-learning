package module14.exercises.ex_8.application;

import module14.exercises.ex_8.domain.entities.PaymentFlow;
import module14.exercises.ex_8.domain.exceptions.DomainException;

public class Program {
  public static void main(String[] args) {
    try {
      PaymentFlow pay = new PaymentFlow(1200.0);
      pay.execute();
    } catch (DomainException e) {
      System.out.println("Payment failed: " + e.getMessage());
    }
  }
}


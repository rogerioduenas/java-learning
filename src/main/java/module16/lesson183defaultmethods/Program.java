package module16.lesson183defaultmethods;

import module16.lesson183defaultmethods.services.BrazilInterestService;
import module16.lesson183defaultmethods.services.InterestService;
import module16.lesson183defaultmethods.services.UsaInterestService;

public class Program {

  public static void main(String[] args) {

    InterestService brIs = new BrazilInterestService(2.0);
    double brPayment = brIs.payment(200.0, 3);

    InterestService usIs = new UsaInterestService(1.0);
    double usPayment = usIs.payment(200.0, 3);

    System.out.println(String.format("Brazil after 3 months: %.2f", brPayment));
    System.out.println(String.format("Usa after 3 months: %.2f", usPayment));
  }
}

package module_16_interface.lesson_183_default_methods;

import module_16_interface.lesson_183_default_methods.services.BrazilInterestService;
import module_16_interface.lesson_183_default_methods.services.InterestService;
import module_16_interface.lesson_183_default_methods.services.UsaInterestService;

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

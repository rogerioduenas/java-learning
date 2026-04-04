package module_16_interface.lesson_175_interface.model.services;

public class BrTaxService implements TaxService {

  public double tax(double amount) {
    if (amount <= 100.0) {
      return amount * 0.2;
    }
    else {
      return amount * 0.15;
    }
  }
}

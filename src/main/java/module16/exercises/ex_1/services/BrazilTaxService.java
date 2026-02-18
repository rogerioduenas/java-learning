package module16.exercises.ex_1.services;

public class BrazilTaxService implements TaxService {

  @Override
  public double calculateTax(double amount) {
    return amount * 0.2;
  }
}

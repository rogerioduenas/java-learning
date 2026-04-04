package module_16_interface.exercises.ex_1.services;

public class UsaTaxService implements TaxService {

  @Override
  public double calculateTax(double amount) {
    return amount * 0.1;
  }
}

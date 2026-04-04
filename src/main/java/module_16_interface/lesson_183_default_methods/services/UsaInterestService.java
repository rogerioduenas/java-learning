package module_16_interface.lesson_183_default_methods.services;

public class UsaInterestService implements InterestService {

  private double interestRate;

  public UsaInterestService(double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getInterestRate() {
    return interestRate;
  }
}

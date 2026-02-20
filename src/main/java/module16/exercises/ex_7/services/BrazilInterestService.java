package module16.exercises.ex_7.services;

public class BrazilInterestService implements InterestService {

  private final double interestRate;

  public BrazilInterestService(double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getInterestRate() {
    return interestRate;
  }
}

package module16.exercises.ex_7.services;

public class JapanInterestService implements InterestService {

  private final double interestRate;

  public JapanInterestService(double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getInterestRate() {
    return interestRate;
  }
}

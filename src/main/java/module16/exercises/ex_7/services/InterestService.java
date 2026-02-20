package module16.exercises.ex_7.services;

public interface InterestService {

  double getInterestRate();

  default double calculatePayment(double amount, int months) {
    return amount + (amount * getInterestRate() * months);
  }
}

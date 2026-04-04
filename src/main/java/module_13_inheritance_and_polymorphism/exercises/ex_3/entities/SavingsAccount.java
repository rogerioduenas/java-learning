package module_13_inheritance_and_polymorphism.exercises.ex_3.entities;

public class SavingsAccount extends Account {

  public SavingsAccount(int number, String holder, Double balance) {
    super(number, holder, balance);
  }

  @Override
  protected Double withdrawFee(Double value) {
    return 0.0;
  }
}

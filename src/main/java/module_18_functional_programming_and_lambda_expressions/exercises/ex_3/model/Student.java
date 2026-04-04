package module_18_functional_programming_and_lambda_expressions.exercises.ex_3.model;

public class Student {
  private final String name;
  private final String course;
  private Double monthlyFee;

  public Student(String name, String course, Double monthlyFee) {
    this.name = name;
    this.course = course;
    this.monthlyFee = monthlyFee;
  }

  public void updateFee(Double percentage) {
    this.monthlyFee += this.monthlyFee * (percentage / 100.0);
  }

  @Override
  public String toString() {
    return String.format("%s, %s, %.2f", name, course, monthlyFee);
  }
}

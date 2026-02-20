package module16.exercises.ex_8.services;

import module16.exercises.ex_8.model.Employee;

public class PunctualityService implements Evaluation {
  private final Employee employee;
  private final double totalPoints;

  public PunctualityService(Employee employee, double totalPoints) {
    this.employee = employee;
    this.totalPoints = totalPoints;
  }

  @Override
  public double calculate() {
    return totalPoints - (employee.getHoursLate() * 10);
  }
}

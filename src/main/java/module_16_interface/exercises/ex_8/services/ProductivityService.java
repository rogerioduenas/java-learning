package module_16_interface.exercises.ex_8.services;

import module_16_interface.exercises.ex_8.model.Employee;

public class ProductivityService implements Evaluation {
  private Employee employee;
  private double meta;

  public ProductivityService(Employee employee, double meta) {
    this.employee = employee;
    this.meta = meta;
  }

  @Override
  public double calculate() {
    return (employee.getDeliveries() * 100.0) / meta;
  }
}

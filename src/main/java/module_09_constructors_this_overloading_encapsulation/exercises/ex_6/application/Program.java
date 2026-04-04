package module_09_constructors_this_overloading_encapsulation.exercises.ex_6.application;

import module_09_constructors_this_overloading_encapsulation.exercises.ex_6.entities.Order;

public class Program {
  public static void main(String[] args) {
    Order result = new Order(1, 20.00);
    result.generateReport();
  }
}

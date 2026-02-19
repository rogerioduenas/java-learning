package module16.exercises.ex_4.entities;

import module16.exercises.ex_4.entities.interfaces.Printer;

public class SimplePrinter implements Printer {

  @Override
  public void print() {
    System.out.println("SimplePrinter: printed successfully.");
  }
}

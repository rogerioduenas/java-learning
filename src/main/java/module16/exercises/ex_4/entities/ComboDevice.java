package module16.exercises.ex_4.entities;

import module16.exercises.ex_4.entities.interfaces.Fax;
import module16.exercises.ex_4.entities.interfaces.Printer;
import module16.exercises.ex_4.entities.interfaces.Scanner;

public class ComboDevice implements Printer, Scanner, Fax {


  @Override
  public void print() {
    System.out.println("ComboDevice: printed successfully.");
  }

  @Override
  public void scan() {
    System.out.println("ComboDevice: scanned successfully.");
  }

  @Override
  public void sendFax() {
    System.out.println("ComboDevice: fax sent successfully.");
  }
}

package module_16_interface.exercises.ex_4.entities;

import module_16_interface.exercises.ex_4.entities.interfaces.Scanner;

public class OfficeScanner implements Scanner {


  @Override
  public void scan() {
    System.out.println("OfficeScanner: scanned successfully.");
  }
}

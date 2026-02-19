package module16.exercises.ex_4;

import module16.exercises.ex_4.entities.ComboDevice;
import module16.exercises.ex_4.entities.OfficeScanner;
import module16.exercises.ex_4.entities.SimplePrinter;

public class Program {
  public static void main(String[] args) {

    SimplePrinter printer = new SimplePrinter();
    OfficeScanner officeScanner = new OfficeScanner();
    ComboDevice comboDevice = new ComboDevice();

    System.out.println("===SimplePrinter===");
    printer.print();
    System.out.println("===OfficeScanner===");
    officeScanner.scan();
    System.out.println("===ComboDevice===");
    comboDevice.print();
    comboDevice.scan();
    comboDevice.sendFax();
  }
}

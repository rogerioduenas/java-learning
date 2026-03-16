package module20;

import java.sql.SQLException;

public class Program {
  public static void main(String[] args) throws SQLException {

    System.out.println("========== READ DATA ==========");
    System.out.println();
    System.out.println("--- departments ---");
    Read.readDepartments();
    System.out.println();
    System.out.println("--- sellers ---");
    Read.readSellers();

    System.out.println("========== INSERT DATA ==========");
    System.out.println();
    System.out.println("--- sellers ---");
    Insert.insertSeller("mike");
    System.out.println();
    System.out.println("--- departments ---");
    Insert.insertMultipleDepartments();
    System.out.println();

    System.out.println("========== UPDATE DATA ==========");
    System.out.println("--- sellers ---");
    Update.updateSalaryByDepartment(1800.0, 1);
  }
}
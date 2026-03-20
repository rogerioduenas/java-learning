package module20.lessons.JDBC_simple;

import module20.lessons.JDBC_simple.extra.Transactions;
import module20.lessons.JDBC_simple.repository.Delete;
import module20.lessons.JDBC_simple.repository.Insert;
import module20.lessons.JDBC_simple.repository.Read;
import module20.lessons.JDBC_simple.repository.Update;

import java.sql.SQLException;

public class Program {
  public static void main(String[] args) throws SQLException {

    System.out.println("========== READ DATA ==========");
    System.out.println("--- departments ---");
    Read.readDepartments();
    System.out.println("--- sellers ---");
    Read.readSellers();

    System.out.println("========== INSERT DATA ==========");
    System.out.println("--- sellers ---");
    Insert.insertSeller("mike");
    System.out.println("--- departments ---");
    Insert.insertMultipleDepartments();
    System.out.println();

    System.out.println("========== UPDATE DATA ==========");
    System.out.println("--- sellers ---");
    Update.updateSalaryByDepartment(300.0, 1);

    System.out.println("========== DELETE DATA ==========");
    System.out.println("--- departments ---");
    Delete.deleteDepartment(2);

    System.out.println("========== TRANSACTIONS ==========");
    System.out.println("--- sellers ---");
    Transactions.transactions();
  }
}

package module15.exercises.ex_3.repository;

import module15.exercises.ex_3.model.Transaction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TransactionReader {

  public static List<Transaction> readTransactions(String filePath) {
    List<Transaction> transactions = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

      String line = br.readLine();

      while (line != null) {

        String[] splitedLine = line.split(";");
        String description = splitedLine[0];
        double amount = Double.parseDouble(splitedLine[1]);
        transactions.add(new Transaction(description, amount));

        line = br.readLine();
      }

    } catch (FileNotFoundException e) {
      System.out.println("File not found");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return transactions;
  }
}

package module15.exercises.ex_3.application;

import module15.exercises.ex_3.model.Transaction;
import module15.exercises.ex_3.repository.TransactionReader;
import module15.exercises.ex_3.service.DailyReportGenerator;

import java.util.List;

public class Program {
  public static void main(String[] args) {

    String filePath = "src/main/java/module15/exercises/ex_3/trasactions.txt";
    String destinationPath = "src/main/java/module15/exercises/ex_3/sumary.txt";

    List<Transaction> transactions = TransactionReader.readTransactions(filePath);
    DailyReportGenerator.generateSummary(transactions, destinationPath);

  }
}

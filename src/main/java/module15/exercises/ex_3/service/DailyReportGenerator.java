package module15.exercises.ex_3.service;

import module15.exercises.ex_3.model.Transaction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DailyReportGenerator {

  public static void generateSummary(List<Transaction> transactions, String destinationPath) {

    double total = 0;
    for (Transaction transaction : transactions) {
      total += transaction.getAmount();
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(destinationPath))) {
      bw.write("Total: " + total);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

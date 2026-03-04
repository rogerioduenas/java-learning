package module17.execises.ex_17;

import module17.execises.ex_17.model.Transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
  public static void main(String[] args) throws IOException {

    Path path = Path.of("src/main/java/module17/execises/ex_17/db/transactions.csv");
    List<String> lines = Files.readAllLines(path);
    Set<Transaction> transactions = new HashSet<>();

    for (String line : lines.subList(1, lines.size())) {
      String[] fields = line.split(",");
      String id = fields[0].trim();
      Double amount = Double.parseDouble(fields[1].trim());
      transactions.add(new Transaction(id, amount));
    }

    System.out.println(transactions);
  }
}

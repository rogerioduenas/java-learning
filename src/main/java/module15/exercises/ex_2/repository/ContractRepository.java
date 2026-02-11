package module15.exercises.ex_2.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository {

  public static List<String> loadContracts(String filePath) {
    List<String> listOfContracts = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

      String line = br.readLine();

      while (line != null) {
        listOfContracts.add(line);
        line = br.readLine();
      }

    } catch (FileNotFoundException e) {
      System.out.println("File not found");

    } catch (IOException e) {
      System.out.println("Error reading file");
    }

    return listOfContracts;
  }
}

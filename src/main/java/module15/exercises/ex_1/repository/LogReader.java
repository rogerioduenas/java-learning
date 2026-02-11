package module15.exercises.ex_1.repository;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogReader {

  private final String filePath;

  public LogReader(String filePath) {
    this.filePath = filePath;
  }

  public List<String> readAll() {
    List<String> lines = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line = br.readLine();
      while (line != null) {
        lines.add(line);
        line = br.readLine();
      }

    } catch (FileNotFoundException e) {
      System.out.println("File not found");

    } catch (IOException e) {
      System.out.println("Error reading file");
    }

    return lines;
  }
}

package module15.lesson165filewriterbufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
  public static void main(String[] args) {

    String[] lines = new String[] {
        "Line 1",
        "Line 2",
        "Line 3",
    };

    String path = "src/main/java/module15/lesson165filewriterbufferedwriter/out.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

package module_15_io.exercises.ex_9;

import module_15_io.exercises.ex_9.model.OutputContent;
import module_15_io.exercises.ex_9.service.OutputService;

public class Program {

  public static void main(String[] args) {
    String destinationPath = "src/main/java/module15/exercises/ex_9/output/text.txt";
    OutputContent outputContent = new OutputContent("Hello World!");
    OutputService.writeOutput(outputContent, destinationPath);
  }
}

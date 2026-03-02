package module17.execises.ex_3;

import module17.execises.ex_3.model.Developer;
import module17.execises.ex_3.service.EvaluationService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Developer> developers = new ArrayList<>(Arrays.asList(
        new Developer("Maria", 85.0),
        new Developer("Anna", 90.0),
        new Developer("Zack", 75.0)
    ));

    System.out.println(EvaluationService.best(developers));
  }
}

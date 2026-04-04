package module_17_generics_set_map.execises.ex_4;

import module_17_generics_set_map.execises.ex_4.service.ReportService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
    ReportService.printList(list);
  }
}

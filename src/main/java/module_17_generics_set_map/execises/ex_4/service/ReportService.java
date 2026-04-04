package module_17_generics_set_map.execises.ex_4.service;

import java.util.List;

public class ReportService {
  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}

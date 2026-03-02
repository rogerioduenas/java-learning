package module17.execises.ex_4.service;

import java.util.List;

public class ReportService {
  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}

package module_17_generics_set_map.execises.ex_10.services;

import java.util.List;

public class ReportService {

  public void printReport(List<?> list) {
    System.out.println(list.toString());
  }
}

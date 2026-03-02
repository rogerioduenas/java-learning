package module17.execises.ex_5.service;

import java.util.List;

public class FinanceService {

  public static double sum(List<? extends Number> list) {
    double sum = 0.0;
    for (Number number : list) {
      sum += number.doubleValue();
    }
    return sum;
  }
}

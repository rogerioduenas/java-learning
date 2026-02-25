package module17.lesson187delimitedgenerics.services;

import java.util.List;

public class CalculationService {

  public static <T extends Comparable<T>> T max(List<T> list) {
    T max = list.get(0);
    for (T item : list) {
      if (item.compareTo(max) > 0) {
        max = item;
      }
    }
    return max;
  }

  //simple (and stupid) generic method
  public static <T> T first(List<T> list) {
    return list.get(0);
  }
}

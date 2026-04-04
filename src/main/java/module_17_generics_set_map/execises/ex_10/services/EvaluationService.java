package module_17_generics_set_map.execises.ex_10.services;

import java.util.List;

public class EvaluationService {
  public <T extends Comparable<? super T>> T findMax(List<T> list) {
    T max = list.getFirst();
    for (T item : list) {
      if (max.compareTo(item) < 0) {
        max = item;
      }
    }
    return max;
  }
}

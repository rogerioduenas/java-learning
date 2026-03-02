package module17.execises.ex_3.service;

import java.util.List;

public class EvaluationService {

  public static <T extends Comparable<? super T>> T best(List<T> list) {
    if (list.isEmpty()) {
      throw new IllegalArgumentException("List is empty");
    }
    T best = list.getFirst();
    for (T item : list) {
      if (best.compareTo(item) < 0) {
        best = item;
      }
    }
    return best;
  }
}

package module17.execises.ex_2.service;

import java.util.List;

public class MaxService {

  public static <T extends Comparable<T>> T max(List<T> list) {
    if (list.isEmpty()) {
      throw new IllegalStateException("List cannot be empty");
    }
    T max = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i).compareTo(max) > 0) {
        max = list.get(i);
      }
    }
    return max;
  }
}
